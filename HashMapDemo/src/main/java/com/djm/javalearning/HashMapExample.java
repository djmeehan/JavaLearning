package com.djm.javalearning;

import java.util.HashMap;

public class HashMapExample {


    private final HashMap<Integer, String> hmap;

    public HashMapExample() {
        this.hmap = generateHashMap();
    }

    public HashMap<Integer, String> generateHashMap() {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        return hmap;
    }

}
