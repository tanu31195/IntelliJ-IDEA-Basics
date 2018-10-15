/*
 * Created by Tanushka Bandara on 10/15/18 10:46 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/15/18 10:46 PM
 */

public class IndexOf {
    public static void main(String[] args) {
        //indexOf: Scans from left to right
        //lastIndexOf: Scans from right to left

        String sent = "This is a random sentence";

        System.out.println(sent.indexOf('s'));
        System.out.println(sent.lastIndexOf('s'));

        System.out.println(sent.indexOf("is"));
        System.out.println(sent.lastIndexOf("is"));

        //extract word "random"
        System.out.println(sent.substring(sent.indexOf("random"), sent.indexOf("random") + 6));
    }
}
