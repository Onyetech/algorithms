package com.ikennascode.string.in.java.abc;

public class CopyString {

    public static void main(String[] args) {



        /**        My solution: Copying one string into another in Java
         *
         *         String y = "ABC tech";
         *         y = y.concat("\0");
         *         char a[] = y.toCharArray();
         *
         *         int i = 0;
         *         int count = 0;
         *
         *         while (a[i] != '\0'){
         *             count++;
         *             i++;
         *         }
         *         System.out.println(count);
         */

          String x = "ABC tech";
          char y[] = x.toCharArray();
          int size = y.length;
          char a[] = new char[size];

          int i = 0;

          while (i != size) {
              a[i] = y[i];
              ++i;
          }
        System.out.println(y);
        System.out.println(a);

    }

}
