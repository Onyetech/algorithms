package com.ikennascode.string.in.java.abc;

public class ContainsIntegerTwo {

    public static void main(String[] args) {

        String x = "975ABC";

        int size = x.length();
        int i = 0;

        while (i != size) {

            if (x.charAt(i) >= '0' && x.charAt(i) <= '9'){
                ++i;
            }
            else {
                System.out.println("Not integer String");
                System.exit(0);
            }
        }
        System.out.println("It is an integer String");
    }
}
