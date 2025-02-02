
package CircularQueue;

import java.util.Scanner;

public class ArrayCircularQueue {
    private int SIZE; // Size of the circular queue
    private int front, rear;
    private int[] items;

    // Constructor to initialize the queue with a user-defined size
    public ArrayCircularQueue(int size) {
        this.SIZE = size;
        this.items = new int[SIZE];
        this.front = -1;
        this.rear = -1;
    }

    // Check if the queue is full
    boolean isFull() {
        return (front == 0 && rear == SIZE - 1) || front == rear + 1;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        return front == -1;
    }

    // Add an element to the queue
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("The queue is overflow, cannot enqueue " + element);
        } else {
            if (front == -1) {
                front = 0; // Initialize front for the first element
            }
            rear = (rear + 1) % SIZE;
            items[rear] = element;
            System.out.println("Inserted: " + element);
            System.out.println("Current front: " + front + ", Current rear: " + rear);
        }
    }

    // Remove an element from the queue
    int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1; // Return -1 to indicate the queue is empty
        } else {
            int element = items[front];
            System.out.println("The element at the front (" + front + ") is dequeued. The front is now updated.");
            if (front == rear) { // If the queue becomes empty
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % SIZE;
            }
            System.out.println("Updated front: " + front);
            return element;
        }
    }

    // Display the elements in the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Items: [");
        int i;
        for (i = front; i != rear; i = (i + 1) % SIZE) {
            System.out.print(items[i] + " ");
        }
        System.out.print(items[i] + "]\n");

        System.out.print("Indexes: ");
        for (i = front; i != rear; i = (i + 1) % SIZE) {
            System.out.print(i + " ");
        }
        System.out.println(i); // Print the last index
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();

        ArrayCircularQueue queue = new ArrayCircularQueue(size);

        // Step 1: Enqueue elements to fill the queue
        System.out.println("\n--- Step 1: Enqueue elements ---");
        for (int i = 1; i <= size; i++) {
            queue.enQueue(i);
        }

        // Attempt to enqueue one more element
        queue.enQueue(size + 1);

        // Step 2: Dequeue one element
        System.out.println("\n--- Step 2: Dequeue an element ---");
        queue.deQueue();

        // Step 3: Enqueue one element after dequeue
        System.out.println("\n--- Step 3: Enqueue another element ---");
        queue.enQueue(size + 1);

        // Final state of the queue
        System.out.println("\n--- Final Queue State ---");
        queue.display();

        scanner.close();
    }
}