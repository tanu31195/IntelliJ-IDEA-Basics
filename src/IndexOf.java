/*
 * Created by Tanushka Bandara on 10/15/18 11:06 PM
 * Copyright (c) 2018.  All Rights Reserved
 * https://tanu31195.github.io/
 *
 * Last Modified 10/15/18 10:53 PM
 */

public class IndexOf {
    public static void main(String[] args) {
        //indexOf: Scans from left to right
        //lastIndexOf: Scans from right to left

        String sent = "This is a random sentence";

        System.out.println(sent.indexOf('s')); //3
        System.out.println(sent.lastIndexOf('s')); //17

        System.out.println(sent.indexOf("is")); //2
        System.out.println(sent.lastIndexOf("is")); //5

        //extract word "random"
        System.out.println(sent.substring(sent.indexOf("random"), sent.indexOf("random") + 6));
    }
}
