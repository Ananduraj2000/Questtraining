package oops.test1.set;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grape");
        list.add("Apple");
        list.add("Grape");
        list.add("PineApple");

        System.out.println("Original list :"+list);

        HashSet<String> set = new HashSet<>(list);

        System.out.println("Updated list :"+set);

    }
}
