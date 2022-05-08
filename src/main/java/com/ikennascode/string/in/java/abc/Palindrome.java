package com.ikennascode.string.in.java.abc;

import java.util.Locale;

public class Palindrome {

    public static void main(String[] args) {

        String x = "too hot to hooT";
        x = x.replace(" ", "");
        x = x.toLowerCase();

        char y[] = x.toCharArray();
        int size = y.length;
        char a[] = new char[size];

        int i = 0;

        while (i != size) {
            a[size - 1 -i] = y[i];
            ++i;
        }
        System.out.println(y);
        System.out.println(a);

        i = 0;
        while (i != size) {

        if (a[i] != y[i]){
            System.out.println("Not a palindrome");
            System.exit(0);
        }
        else {
            ++i;

        }
        }
        System.out.println("Palindrome");



    }
}
