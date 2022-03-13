package com.ikennascode;

public class ComputeMeanDeviation {
    public static void main(String[] args) {
        int number = 0;
        double sum = 0;

        double squareSum = 0;

        for (int i = 1; i < 10; i++) {
//          generates a new random number
            number = (int) (Math.random() * 100);
            for (int j = 0; j < number; j++) {
                if (number == 60) {
                    System.out.println("you got it you got it you got it you got it you got it");
                } else {
                    System.out.println("It is not here");
                }
                System.out.println(number);
                sum += number;
            }

        }
    }}
