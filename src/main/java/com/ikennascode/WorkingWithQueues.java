package com.ikennascode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("James", 33));
        linkedList.add(new Person("Onoo", 35));
        linkedList.addFirst(new Person("Jonathan", 45));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while(personListIterator.hasNext()){
            System.out.println("first "+personListIterator.next());
        }
        while(personListIterator.hasPrevious()){
            System.out.println("second "+personListIterator.previous());
        }


        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("John", 34));
        supermarket.add(new Person("Caleb", 27));

        System.out.println(supermarket.peek()); //shows the peek value
        System.out.println(supermarket.remove()); //removes
        System.out.println(supermarket);

        System.out.println(supermarket.peek()); //shows the peek value
        System.out.println(supermarket.poll()); //removes
        System.out.println(supermarket); //prints all
        System.out.println(supermarket.size());
    }
        static record Person(String name, int age){

    }
}
