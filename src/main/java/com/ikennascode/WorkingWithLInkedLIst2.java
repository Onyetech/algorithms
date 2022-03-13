package com.ikennascode;

import java.util.LinkedList;

public class WorkingWithLInkedLIst2 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.push("D");
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("F");
        linkedList.push("C");
        linkedList.push("E");
//        linkedList.peek();
        System.out.println("The poll method is this "+linkedList.poll());
        System.out.println("The pop method is this "+linkedList.pop());
        System.out.println("The peek method is this "+linkedList.peek());
        linkedList.poll();
        System.out.println(linkedList);
    }

}
