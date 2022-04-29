package com.ikennascode;


import org.w3c.dom.Node;

public class LinkedListExample {

    Node head; // head of list

    static class Node {
        int data;
        Node next;


        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedListExample insert(LinkedListExample list, int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;

        }
        return list;
    }

    public static void printList(LinkedListExample list) {
        Node currNode = list.head;
        System.out.println("LinkedList: ");

        while (currNode != null){
            System.out.println(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        System.out.println(" ");
        System.out.println(list);

    }



}

