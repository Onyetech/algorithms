package com.ikennascode;

import java.util.LinkedList;

public class WorkingWithLinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("4");
        linkedList.offer("3");
        linkedList.offer("2");
        linkedList.offer("1");
        linkedList.offer("0");

//        linkedList.poll();
        linkedList.add(2,"-2");   // [4,3,-2,2,1,0]

        linkedList.remove("3"); // [4,-2,2,1,0]
        System.out.println(linkedList.indexOf("0")); // 4
        System.out.println(linkedList); // prints line 17

//        methods related to linkedList

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("5");
        linkedList.addLast("-1");
        System.out.println(linkedList);

        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println(linkedList);
    }
}
