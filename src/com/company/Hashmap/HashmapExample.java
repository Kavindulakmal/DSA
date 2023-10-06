package com.company.Hashmap;

import java.util.HashMap;

public class HashmapExample {

    public static void main(String[] args) {

        HashMap<String,String> capital = new HashMap<String, String>();

        //add value to hashmap=put()
        capital.put("sri lanka", "colombo");
        capital.put("india", "new delhi");
        capital.put("england","london");
        capital.put("gerany","berlin");
        capital.put("norway","oslo");

        //System.out.println(capital);

        //access an item=get()
        System.out.println(capital.get("england"));

        //remove an item
        capital.remove("norway");
        System.out.println(capital);

        //to clear all tems
        capital.clear();
        System.out.println(capital);
    }
}
