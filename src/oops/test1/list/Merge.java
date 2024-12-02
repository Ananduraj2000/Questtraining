package oops.test1.list;

import java.util.*;

public class Merge {
    public static void main(String[] args) {



        List<String> list1 = new ArrayList<>(Arrays.asList("Apple","Banana","Orange","Carrot"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Red","Yellow","Orange","Orange"));


        System.out.println("Original list 1: "+list1);
        System.out.println("Original list 2: "+list2);

        list1.addAll(list2);

        System.out.println("Merged list with duplicates : "+list1);

        Set<String> merge= new HashSet<>(list1);

        List<String> mergeList=new ArrayList<>(merge);

        System.out.println("Merged list without duplicate: "+mergeList);
    }
}
