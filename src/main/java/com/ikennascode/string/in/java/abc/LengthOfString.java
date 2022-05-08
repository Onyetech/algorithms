package com.ikennascode.string.in.java.abc;

public class LengthOfString {

    public static void main(String[] args) {

        String x = "ABC tech";
        System.out.println(x.length());

        x = x.concat("\0");
        char y[] = x.toCharArray();

        int count = 0;
        int i = 0;
        while(y[i] != '\0')
        {
         ++count;
         ++i;
        }
        System.out.println(count);





    }

}
