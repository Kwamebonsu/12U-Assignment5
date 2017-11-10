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
        // There is room in the stack
        if (index < stack.length) {
            // place the new number in at index
            stack[index] = num;
            // increase the counter
            numItems++;

        } else {
            // make more room in the stack
            int[] temp = new int[stack.length * 2];
            // Copy items over
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            // stack becomes the new array
            stack = temp;
            // place the new number in at index
            stack[index] = num;
            // increase the counter
            numItems++;
        }
    }

    // Remove an item from the stack
    public int remove(int index) {
        int item = stack[index];
        // Move all the numbers after index down 1 spot
        for (int i = index; i < numItems; i++) {
            stack[i] = stack[i + 1];
        }
        // decrease the counter
        numItems--;
        // the number that has been removed
        return item;
    }

    public int get(int index) {
        return stack[index];
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
        A5Q2 list = new A5Q2();
        // Test the isEmpty method
        System.out.println("The list is Empty: " + list.isEmpty());
        // Test the adding method
        list.add(0, 6);
        list.add(2, 4);
        list.add(1, 1);
        list.add(6, 3);
        list.add(11, 13);
        list.add(9, 10);
        list.add(10, 65);
        list.add(3, 14);
        list.add(7, 2);
        list.add(5, 8);
        list.add(8, 9);
        list.add(4, 10);
        System.out.println("Positon 0: " + list.get(0));
        System.out.println("Positon 1: " + list.get(1));
        System.out.println("Positon 2: " + list.get(2));
        System.out.println("Positon 3: " + list.get(3));
        System.out.println("Positon 4: " + list.get(4));
        System.out.println("Positon 5: " + list.get(5));
        System.out.println("Positon 6: " + list.get(6));
        System.out.println("Positon 7: " + list.get(7));
        System.out.println("Positon 8: " + list.get(8));
        System.out.println("Positon 9: " + list.get(9));
        System.out.println("Positon 10: " + list.get(10));
        System.out.println("Positon 11: " + list.get(11));

        // Test the size method
        System.out.println("The list has " + list.size() + " numbers");
        // Test the isEmpty method
        System.out.println("The list is Empty: " + list.isEmpty());
        // Test the get method
        System.out.println("Number at position 5: " + list.get(5));
        System.out.println("");
        System.out.println("");
        System.out.println("");
        // Test the remove method
        list.remove(5);
        System.out.println("Size: " + list.size());
        System.out.println("Positon 0: " + list.get(0));
        System.out.println("Positon 1: " + list.get(1));
        System.out.println("Positon 2: " + list.get(2));
        System.out.println("Positon 3: " + list.get(3));
        System.out.println("Positon 4: " + list.get(4));
        System.out.println("Positon 5: " + list.get(5));
        System.out.println("Positon 6: " + list.get(6));
        System.out.println("Positon 7: " + list.get(7));
        System.out.println("Positon 8: " + list.get(8));
        System.out.println("Positon 9: " + list.get(9));
        System.out.println("Positon 10: " + list.get(10));
        System.out.println("Positon 11: " + list.get(11));
    }
}