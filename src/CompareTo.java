/*
 * Created by Tanushka Bandara on 10/14/18 6:07 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/14/18 6:07 PM
 */

import javax.swing.*;

public class CompareTo {
    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter a word...");
        String word2 = JOptionPane.showInputDialog("Enter a word 2...");

        System.out.println(word1.compareTo(word2));

        if (word1.compareTo(word2) > 0) {
            System.out.println("Two words are equal");
            System.out.println(word1 + " comes after " + word2);
        } else {
            System.out.println("Two words are different");
            System.out.println(word1 + " comes before " + word2);
        }

    }
}
