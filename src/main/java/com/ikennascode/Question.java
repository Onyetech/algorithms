package com.ikennascode;

import java.util.ArrayList;

public class Question {

    public static void main(String[] args) {
        int m = 4;
        ArrayList<String> a = new ArrayList<>(m);
        a.add("4");
        a.add("2");
        a.add("1");
        a.add("3");

        System.out.println(a);

        int n = 3;
        ArrayList<String> b = new ArrayList<>(n);
        b.add("6");
        b.add("5");
        b.add("7");

        System.out.println(b);
        System.out.println("a elements are " +a+ " b elements are "+b);
        System.out.println();

//        Queue<String> ab = new PriorityQueue<>();
//        print both m and n above together in sorted order


    }
}
