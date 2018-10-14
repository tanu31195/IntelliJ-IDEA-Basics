/*
 * Created by Tanushka Bandara on 10/14/18 6:07 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/14/18 5:56 PM
 */

import javax.swing.*;

public class Length {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Enter your Password...");
        while (password.length() < 8 || password.length() > 16) {
            password = JOptionPane.showInputDialog("Re-Enter your Password (min 8, max 15 characters)...");
        }
        System.out.println("Your Password is: " + password);
    }
}
