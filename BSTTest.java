/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BSTSample;

/**
 *
 * @author hansika.s
 */
public class BSTTest {

    public static void main(String[] args) {
        BST bst = new BST();
        
        bst.insert(10);
        bst.insert(5);
        bst.insert(30);
        bst.insert(2);
        bst.insert(25);
        bst.insert(45);
        
        System.out.println("In-order Traversal");
        bst.inOrder();
        
        System.out.println("Pre-order Traversal");
        bst.preOrder();
        
        System.out.println("Post-order Traversal");
        bst.postOrder();
        /*
        bst.delete(2);
        System.out.println("After deletion of 2");
        bst.inOrder();
        
        bst.delete(5);
        System.out.println("After deletion of 5");
        bst.inOrder();
        */
        bst.delete(30);
        System.out.println("After deletion of 10");
        bst.inOrder();
    }
    
}
