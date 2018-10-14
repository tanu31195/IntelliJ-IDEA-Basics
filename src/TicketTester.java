/*
 * Created by Tanushka Bandara on 10/14/18 5:28 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/14/18 5:28 PM
 */

import javax.swing.*;

public class TicketTester {
    public static void main(String[] args) {
        int users, yEntry, nEntry, count, age;

        users = Integer.parseInt(JOptionPane.showInputDialog("Enter number of users..."));
        yEntry = 0;
        nEntry = 0;
        count = 1;

        while (count <= users) {
//            String userInput = JOptionPane.showInputDialog("Enter user " + count + " Age...");
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter user " + count + " Age..."));

            if (age >= 18) {
                System.out.println("User " + count + " Age: " + age + ": Entry Allowed");
                yEntry++;
            } else {
                System.out.println("User " + count + " Age: " + age + ": No Entry");
                nEntry++;
            }

            count++;
        }
        System.out.println(yEntry + " are allowed to enter \n" + nEntry + " are not allowed to enter");
        int percent = yEntry * 100 / users;
        System.out.println(percent + "% Allowed to enter");
    }
}
