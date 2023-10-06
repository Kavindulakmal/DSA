package com.company.LinkedList;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<String>();

        //Use as a Stack
//        linkedList1.push("A");
//        linkedList1.push("B");
//        linkedList1.push("C");
//        linkedList1.push("D");
//        linkedList1.push("F");
//
//        System.out.println(linkedList1);
//
//        linkedList1.pop();

        //use as a queue
        linkedList1.offer("A");
        linkedList1.offer("B");
        linkedList1.offer("C");
        linkedList1.offer("D");
        linkedList1.offer("F");
      System.out.println(linkedList1);

        //linkedList1.poll();
        //add value to linkedlist
        linkedList1.add(4,"E");
        linkedList1.add(6,"G");
        System.out.println(linkedList1);

        //To remove a value
        linkedList1.remove("G");
        System.out.println(linkedList1);

        //add value to head
        linkedList1.addFirst("1");
        System.out.println(linkedList1);

        //add value to last
        linkedList1.addLast("x");

        //remove first & last value
        linkedList1.removeFirst();
        linkedList1.removeLast();
        System.out.println(linkedList1);



    }
}
