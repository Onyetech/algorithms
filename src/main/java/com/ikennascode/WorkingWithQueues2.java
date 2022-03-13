package com.ikennascode;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class WorkingWithQueues2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("4");
        queue.offer("5");
        queue.offer("8");
        queue.offer("3");
        queue.offer("6");

        System.out.println("The size is: "+queue.size());

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
