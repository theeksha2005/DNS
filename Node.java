package Tutorial;

public class Node {
    public int data; // Value of the node
    public Node next; // Reference to the next node

	// Constructor to initialize a node
    public Node(int data) {
        this.data = data;
        this.next = null; // By default, the next reference is null
    }
}
