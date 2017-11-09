/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.assignment5;

/**
 *
 * @author bonsk5852
 */
public class A5Q2 {
// Store all the integers on the stack

    private int[] stack;
    // keep track of how many items
    private int numItems;

    // Constructor
    public A5Q2() {
        stack = new int[10];
        numItems = 0;
    }

    // Add an item to the stack
    public void add(int index, int num) {
        
    }
    
    // Remove an item from the stack
    public int remove(int index) {
        return 0;
    }
    
    // Get the size
    public int size() {
        return numItems;
    }
    
    // Check if the array is empty
    public boolean isEmpty() {
        return numItems == 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
}