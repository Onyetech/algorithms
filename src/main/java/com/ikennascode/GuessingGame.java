package com.ikennascode;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10: ");

        int inputNumber1 = keyboard.nextInt();
        System.out.println("Enter another number");
        int inputNumber2 = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;


        if (inputNumber1 + inputNumber2 ==  randomNumber){
            System.out.println("*********************");
            System.out.println("* Great * * You Win *");
            System.out.println("*********************");
        }
        else {
            System.out.println("***** You lose *****");
            System.out.println("The randon number was " +randomNumber+ ".");
        }
            System.out.println("Thank you for playing!");

        keyboard.close();

    }
}
