package com.company.ArrayList;

public class MainArraylist {
    public static void main(String[] args) {

        ArraylistManual arraylist = new ArraylistManual(5);
        //System.out.println(arraylist.capacity);

        arraylist.add("A");
        arraylist.add("B");
        arraylist.add("C");
        arraylist.add("D");
        arraylist.add("E");

        //insert
//        arraylist.insert(0,"kamal");
//        arraylist.insert(7,"amal");
//        arraylist.delete("kamal");
//        arraylist.delete("A");
//        arraylist.delete("B");


        System.out.println(arraylist);
        System.out.println(arraylist.isEmpty());
        System.out.println(arraylist.search("D"));
        System.out.println(arraylist.capacity);


    }
}
