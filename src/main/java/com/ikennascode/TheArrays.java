package com.ikennascode;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[6];
        colors[0] = "purple";
        colors[1] = "blue";
        colors[4] = "white";
        colors[3] = "yellow";
        colors[0]="green";
        System.out.println("Called all: " +Arrays.toString(colors));
        System.out.println("The alone called: " +colors[2]);





        int[] numbers = {100, 200};
        for (int i = 0; i < colors.length; i++) {
            System.out.println("First method souted " +colors[i]);
        }

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println("Second method souted "+colors[i]);
        }
        System.out.println(colors.length);

        for (String color : colors){
            System.out.println(color);
        }
        Arrays.stream(colors).forEach(System.out::println);
    }
}
