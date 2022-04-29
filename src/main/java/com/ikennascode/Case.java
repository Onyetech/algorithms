package com.ikennascode;

import java.util.Locale;

public class Case {



    public static void main(String[] args) {

        Case2 c = new Case2();
        c.call("gg");


        String name = "Susan";
        String p = name.toLowerCase(Locale.ROOT);
        System.out.println(name.toUpperCase());
        System.out.println(p);

        String sp = name.split("u".toLowerCase())[1];
        System.out.println(sp);

        String exclaim = addExclamationPoint("hot dogs");
        System.out.println(exclaim);
    }
    public static String addExclamationPoint(String s){
//        System.out.println(s + "!");
        return s + "!";
    }





}
