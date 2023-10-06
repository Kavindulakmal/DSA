package com.company.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){

        Queue<String> newqueues = new LinkedList<String>();{

            newqueues.offer("john");
            newqueues.offer("kamal");
            newqueues.offer("nimal");
            newqueues.offer("namal");

            //to print the queue
            System.out.println(newqueues);

            //System.out.println(newqueues.isEmpty()); *to check empty
            //System.out.println(newqueues.size()); *to check size of queue
            //System.out.println(newqueues.contains("amal")); * to check a value
            //System.out.println(newqueues.peek());  * to check te top value

            //to remove a value
            newqueues.poll();
            newqueues.poll();
            newqueues.poll();
            newqueues.poll();

            System.out.println(newqueues);

        }

    }
}
