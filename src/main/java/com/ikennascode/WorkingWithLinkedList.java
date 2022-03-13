package com.ikennascode;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<Person>();
        linkedList.add(new Person("Alex", 35));
        linkedList.add(new Person("Jude", 23));
        linkedList.add(new Person("Mark", 67));
        linkedList.addFirst(new Person("Sunday", 18));


        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }


        linkedList.forEach(person -> {
            System.out.println(linkedList);
        });




    }

        static record Person(String name, int age){

    }
}
