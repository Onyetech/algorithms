package com.ikennascode;

import java.util.Objects;
import static java.lang.System.*;
import java.util.Scanner;

public class CheckingAPassword {
    public static void main(String[] args) {

        System.out.println("What is the Password? ");

        Scanner keyboard = new Scanner(in);
        String password = keyboard.next();

        out.println("You typed >> " + password + " <<");   // used here
        System.out.println("");

        if (Objects.equals(password, "1234abc")) {
            System.out.println("The character you typed is stored in the same place as the real password.");
            System.out.println("You must be a hacker!");
        } else {
            System.out.println("The character you typed is not the same as the real password.");
            System.out.println("No big deal.");
        }
        System.out.println("");
        if (password.equals("1234abc")) {
            System.out.println("The character you typed is the same as our own. You can use our precious platform");
        } else {
            System.out.println("The character you typed is not the same as that to unlock our platform.");
            System.out.println("You may try again.");
        }
        keyboard.close();
    }

}
