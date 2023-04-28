package com.examples.collections;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> rollNumberNameMap = new HashMap<>();
        rollNumberNameMap.put(1, "JAVA");
        rollNumberNameMap.put(2, "SPRING");
        rollNumberNameMap.put(3, "MAVEN");
        rollNumberNameMap.put(4, "SQL");

        rollNumberNameMap.put(2, "SPRINGBOOT");

        rollNumberNameMap.remove(2);

        Set<Integer> keySet = rollNumberNameMap.keySet();

        keySet.forEach(key-> {
            System.out.println("Key: "+key+" :: Value: "+rollNumberNameMap.get(key));
        });



    }
}
