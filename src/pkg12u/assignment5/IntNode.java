/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.assignment5;

/**
 *
 * @author bonsk5852
 */
public class IntNode {

    private int item;
    private IntNode next;

    public IntNode(int num) {
        item = num;
        next = null;
    }

    /**
     *
     * @return the stored number
     */
    public int getNum() {
        return item;
    }

    /**
     * Returns the node that comes after
     *
     * @return the next node
     */
    public IntNode getNext() {
        return next;
    }

    /**
     * Sets the node that comes after
     *
     * @param node the node to the point to
     */
    public void setNext(IntNode node) {
        next = node;
    }
}