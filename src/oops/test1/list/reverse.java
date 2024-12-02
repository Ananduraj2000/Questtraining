package oops.test1.list;

import java.util.ArrayList;
import java.util.List;

public class reverse {

    public static void reverse(List<Integer> list) {

        int start=0;
        int end=list.size()-1;

        while(start<end) {
            int temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(55);
        list1.add(24);
        list1.add(38);
        list1.add(35);
        list1.add(45);

        System.out.println("Original list: "+list1);

        reverse(list1);

        System.out.println("Reversed list: "+list1);


    }
}
