package com.ikennascode.string.in.java.abc;

import java.util.Arrays;

public class CheckIfAnagram {

    public static void main(String[] args) {

        String x = "IKENNA";
        String y = "ENK NIA";

        x = x.replace(" ", "");
        y = y.replace(" ", "");

        x = x.toLowerCase();
        y = y.toLowerCase();

        char[] a = x.toCharArray();
        char[] b = y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean check = Arrays.equals(a,b);

        if (check){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
