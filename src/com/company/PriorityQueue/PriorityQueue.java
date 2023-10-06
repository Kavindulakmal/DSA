package com.company.PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Double> queuep = new java.util.PriorityQueue<Double>();

        //input avg of marks of student in a class
        queuep.offer(30.3);
        queuep.offer(90.3);
        queuep.offer(80.3);
        queuep.offer(60.3);
        queuep.offer(70.3);

        while (!queuep.isEmpty()){
            System.out.println(queuep.poll());
        }


    }
}
