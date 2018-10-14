/*
 * Created by Tanushka Bandara on 10/14/18 6:07 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/14/18 6:07 PM
 */

import javax.swing.*;

public class IsDigit {
    public static void main(String[] args) {
        char ch = JOptionPane.showInputDialog("Enter a Letter...").charAt(0);
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is not a Digit");
        }
    }
}
