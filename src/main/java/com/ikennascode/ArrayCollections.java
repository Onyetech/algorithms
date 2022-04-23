package com.ikennascode;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayCollections {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(4);

        list.add("Z");
        list.add("L");
        list.add("T");
        list.add("O");
        list.add("A");


        Collections.sort(list);


        System.out.println(list);
    }
}
