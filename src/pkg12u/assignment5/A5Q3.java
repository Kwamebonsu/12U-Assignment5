/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12u.assignment5;

/**
 *
 * @author bonsk5852
 */
public class A5Q3 {

    // Store all the integers on the stack
    private String[] stack;

    // Constructor
    public A5Q3() {
        stack = new String[10];
    }

    public boolean inLang(String word) {
        // Return false if the middle character is not "$"
        if (word.charAt(word.length() / 2) != '$') {
            return false;
        }
        // Go through the word comparing the first and last letters
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test the method
        A5Q3 test = new A5Q3();
        String word = "cat$cat";
        System.out.println("The word " + word + " is in the language: " + test.inLang(word));
    }
}
