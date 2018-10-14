/*
 * Created by Tanushka Bandara on 10/14/18 11:35 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/14/18 11:34 PM
 */

import javax.swing.*;

public class DataProcessor {
    public static void main(String[] args) {
        String fNameOne = "", lNameOne = "", fNameTwo = "", lNameTwo = "", temp = "ZZZ";
        int age = 0;

        for (int i = 0; i < 2; i++) {
            while (age <= 18) {
                fNameOne = JOptionPane.showInputDialog("Enter your First Name...").toUpperCase();
                lNameOne = JOptionPane.showInputDialog("Enter your Last Name...").toUpperCase();
                age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age..."));
            }
            if (temp.compareTo(lNameOne) > 0) {
                temp = lNameOne;
                lNameTwo = fNameTwo;
                fNameTwo = fNameOne.charAt(0) + ". " + lNameOne + "\n" + age;
            } else {
                lNameTwo = fNameOne.charAt(0) + ". " + lNameOne + "\n" + age;
            }
            age = 0;
        }
        System.out.println(fNameTwo + "\n" + lNameTwo);
    }
}
