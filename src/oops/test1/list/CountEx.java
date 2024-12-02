package oops.test1.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountEx {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(5);

        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer i : list) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println("Occurrences are :");
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Number "+entry.getKey() + " Appears : " + entry.getValue());
        }
    }
}
