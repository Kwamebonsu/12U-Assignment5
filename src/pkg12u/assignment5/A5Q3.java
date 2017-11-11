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

    // Store all the characters on the stack
    private char[] stack;

    // Constructor
    public A5Q3() {
        stack = new char[10];
    }

    public boolean inLang(String word) {
        // return false if the middle letter is not '$'
        if (word.charAt(word.length() / 2) != '$') {
            return false;
        }
        // while the word is more the one letter
        if (word.length() > 1) {
            // Put the characters into a stack
            for (int i = 0; i < word.length(); i++) {
                stack[i] = word.charAt(i);
            }
            // compare the first and last letters
            if (stack[0] == stack[word.length() - 1]) {
                // if they are the same, remove the first and last letter from the word
                word = word.substring(1, word.length() - 1);
                // call on the method again with the new, shortened word
                return inLang(word);
            } else {
                // If the first and last letter do not match
                return false;
            }
        } else {
            // If the word length reaches 1
            return true;

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test the method
        A5Q3 test = new A5Q3();
        String word = "cat$tac";
        System.out.println("The word " + word + " is in the language: " + test.inLang(word));
        word = "hello";
        System.out.println("The word " + word + " is in the language: " + test.inLang(word));
        word = "cattac";
        System.out.println("The word " + word + " is in the language: " + test.inLang(word));
    }
}
