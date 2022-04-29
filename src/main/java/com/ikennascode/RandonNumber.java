package com.ikennascode;

import java.util.Random;



public class RandonNumber {

    public static void main(String[] args) {


        String accountNumber = String.valueOf(System.currentTimeMillis());
        String accountNum2 = String.valueOf("123     " +generateUniqueAccount(10));
        System.out.println("hello");

        System.out.println(accountNum2);

        System.out.println(System.currentTimeMillis());
        System.out.println(accountNumber);

    }

    public static long generateUniqueAccount(int length) {
        Random randomNum = new Random();
        char[] digits = new char[length];
        digits[0] = (char) (randomNum.nextInt(9) + '2');
        for (int i = 1; i < length; i++) {
            digits[i] = (char) (randomNum.nextInt(10) + '0');
        }
        System.out.println(randomNum);
        return Long.parseLong(new String(digits));
    }
}
