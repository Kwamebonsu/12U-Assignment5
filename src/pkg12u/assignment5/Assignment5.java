/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.assignment5;

/**
 *
 * @author bonsk5852
 */
public class Assignment5 {

    private IntNode head;
    private int numItems;

    public Assignment5() {
        head = null;
        numItems = 0;
    }

    public void add(int num) {
        // Start at beginning of list
        IntNode node = head;
        // If the list is empty, add the number to the 1st spot
        if (node == null) {
            IntNode temp = new IntNode(num);
            head = temp;
            // If the number is the smallest number in the list, set num to head
        } else if (num < node.getNum()) {
            // create the node
            IntNode temp = new IntNode(num);
            // the new node points to the start
            temp.setNext(head);
            // reassign the head node
            head = temp;
        } // If the number is not the smallest number, add it to the list
        else {
            // Go through the list until the right spot is found
            int pos = 0;
            while (num > node.getNum()) {
                node = node.getNext();
                pos++;
            }
            // move to the node before the insert
            for (int i = 0; i < pos - 1; i++) {
                node = node.getNext();
            }
            // @ node just before insert
            IntNode temp = new IntNode(num);
            // create the after link first
            temp.setNext(node.getNext());
            // change node pointer
            node.setNext(temp);
        }
        // increase the item counter
        numItems++;
    }

    public int size() {
        return numItems;
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public int get(int position) {
        IntNode node = head;
        // move the number of time
        for (int i = 0; i < position; i++) {
            node = node.getNext();
        }
        // Return the number at that position
        return node.getNum();
    }

    public void remove(int pos) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assignment5 list = new Assignment5();
        list.add(6);
        list.add(3);
        list.add(10);
        list.add(2);
    }
}
