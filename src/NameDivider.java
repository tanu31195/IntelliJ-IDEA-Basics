/*
 * Created by Tanushka Bandara on 10/15/18 11:06 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/15/18 11:05 PM
 */

import javax.swing.*;

//Name: Joe Henry Blogs
//Extract the name and output as 3 different variables

public class NameDivider {
    public static void main(String[] args) {
        String fullName = JOptionPane.showInputDialog("Enter your full name");

        String fName, mName, lName;

        fName = fullName.substring(0, fullName.indexOf(' '));
        mName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        lName = fullName.substring(fullName.lastIndexOf(' ') + 1);

        System.out.println(fullName);
        System.out.println("First Name: " + fName + "\nMiddle Name: " + mName + "\nLast Name: " + lName);

        System.out.println(fName + " " + mName.charAt(0) + ". " + lName);
    }
}
