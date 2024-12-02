package oops.test1.set;

import java.util.HashSet;
import java.util.Iterator;

public class RemovesBy3 {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(6);
        set.add(40);
        set.add(4);
        set.add(5);
        set.add(18);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer i=iterator.next();
            if(i%3==0){
                iterator.remove();
            }
        }

        System.out.println("The updated list is :"+set);


    }
}
