/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queuestack;

import java.util.NoSuchElementException;

public class StackQueue {
    private Stack stack1; // Stack for enqueue operations
    private Stack stack2; // Stack for dequeue operations

    // Constructor to initialize both stacks
    public StackQueue(int size) {
        stack1 = new Stack(size);
        stack2 = new Stack(size);
    }

    // Enqueue an element into the queue
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }

        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Pop and return the top element from stack2
        return stack2.pop();
    }

    // Peek at the front element of the queue
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        // Peek at the top element of stack2
        return stack2.peek();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
