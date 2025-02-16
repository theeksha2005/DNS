package boundedStack;

import java.util.NoSuchElementException;

public class BoundedArrayStack {

	private int maxSize; //size of the stack array
	private int[] array; //array creation
	private int tos; //top of the stack

	public BoundedArrayStack(int s) {
		maxSize = s; //set array size
		array = new int[maxSize];
		tos = -1; //no items
	}
	
	//isEmpty method
	public boolean isEmpty() {
		return tos == -1; //stack is empty if the top is -1
	}
	
	//isFull method
	public boolean isFull() {
		return tos == maxSize - 1; //stack is full if the top reaches maxSize - 1
	}
	
	//push operation
	public void push(int j) {
		//check whether the stack is full
		if(isFull()) {
			throw new IllegalStateException("Stack is full.");
		}else {
			//increment top
			//insert item
			array[++tos] = j;			
		}

	}
	
	//pop operation
	public int pop() {
		//check whether stack is empty
		//if not
		//access item
		if(isEmpty()) {
			throw new NoSuchElementException("Stack is empty.");
		}else {
			return array[tos--];
		}
	}
	
	//peek operation
	public int peek() {
		if(tos==-1) {
			throw new NoSuchElementException("Stack is empty");
		}else {
			return array[tos];
		}
	}
	
	public void print() {
	        System.out.print("Stack elements: [");
	        for (int i = tos; i >= 0; i--) { // Traverse from top to bottom
	            System.out.print(array[i] + " ");
	        }
	        System.out.println("]");
	}

	
}
