package oops.test1.map;

import java.util.HashMap;
import java.util.TreeMap;

public class Sorting {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 1);
        map.put("Apple", 2);
        map.put("Carrot", 3);
        map.put("Egg", 4);
        map.put("Dog", 5);

        System.out.println("\nBefore sorting:");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        TreeMap<String,Integer> map2 = new TreeMap<>(map);

        System.out.println("\nAfter sorting:");
        for (String key : map2.keySet()) {
            System.out.println(key + " : " + map2.get(key));
        }


    }
}
