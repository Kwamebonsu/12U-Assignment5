/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.assignment5;

/**
 *
 * @author bonsk5852
 */
public class A5Q1 {

    private IntNode head;
    private int numItems;

    public A5Q1() {
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
        } // If it is the biggest number, add it to the end
        else if (num > get(numItems - 1)) {
            // travel to the end of the array
            while (node.getNext() != null) {
                node = node.getNext();
            }
            // node is the last node in the list
            IntNode temp = new IntNode(num);
            // insert it into the list
            node.setNext(temp);
        } // If the number is not the smallest number, add it to the list
        else {
            // Go through the list until the right spot is found
            while (num < node.getNum()) {
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

    public void remove(int num) {
        IntNode node = head;









        // removing the first number
        if (num == node.getNum()) {
            head = head.getNext();
            // decrease the counter
            numItems--;
        } // Removing the last number
        else if (num == numItems - 1) {
            // move to the spot just before
            for (int i = 0; i < size() - 1; i++) {
                node = node.getNext();
            }
            // the node to remove
            IntNode toRemove = node.getNext();
            // its next node
            IntNode next = toRemove.getNext();
            // set all the links
            node.setNext(next);
            toRemove.setNext(null);
            // decrease the counter
            numItems--;
        } // removing from the middle
        else {
            // move to the spot just before
            while (num > node.getNext().getNum()) {
                node = node.getNext();
            }
            // decrease the counter if the number is in the list
            if (num == node.getNext().getNum()) {
                numItems--;
            }
            System.out.println("Kwame " + node.getNum());
            // the node to remove
            IntNode toRemove = node.getNext();
            // its next node
            IntNode next = toRemove.getNext();
            // set all the links
            node.setNext(next);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a linked list
        A5Q1 list = new A5Q1();
        // Add numbers to the list
        list.add(6);
        System.out.println("Position 0: " + list.get(0));
        System.out.println("");
        list.add(3);
        System.out.println("Position 0: " + list.get(0));
        System.out.println("Position 1: " + list.get(1));
        System.out.println("");
        list.add(10);
        System.out.println("Position 0: " + list.get(0));
        System.out.println("Position 1: " + list.get(1));
        System.out.println("Position 2: " + list.get(2));
        System.out.println("");
        list.add(-2);
        System.out.println("Size: " + list.size());
        System.out.println("Position 0: " + list.get(0));
        System.out.println("Position 1: " + list.get(1));
        System.out.println("Position 2: " + list.get(2));
        System.out.println("Position 3: " + list.get(3));
//        list.add(8);
//        System.out.println("Size: " + list.size());
//        System.out.println("Position 0: " + list.get(0));
//        System.out.println("Position 1: " + list.get(1));
//        System.out.println("Position 2: " + list.get(2));
//        System.out.println("Position 3: " + list.get(3));
//        System.out.println("Position 4: " + list.get(4));
        list.remove(3);
        System.out.println("Size: " + list.size());
        System.out.println("Position 0: " + list.get(0));
        System.out.println("Position 1: " + list.get(1));
        System.out.println("Position 2: " + list.get(2));
//        System.out.println("Position 3: " + list.get(3));
    }
}
