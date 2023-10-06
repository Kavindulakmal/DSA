package com.company.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(); //create a arrylist

        //add values
        al.add("kamal");
        al.add("amal");
        al.add("namal");
        al.add("sapumal");

        //System.out.println(al);

        //Access an Item
        //al.get(0);
       // System.out.println(al.get(0));

        //change an item
        al.set(0,"nimal");
        System.out.println(al);

        //Remove an Item
        al.remove(0);
        System.out.println(al);

        //clear arrylist
        //al.clear();
        //System.out.println(al);

        //check size
        System.out.println(al.size());
    }
}
