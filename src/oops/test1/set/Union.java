package oops.test1.set;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);


        HashSet<Integer> union=new HashSet<>();
        union.addAll(set);
        union.addAll(set2);

        HashSet<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set2);

        HashSet<Integer> difference = new HashSet<>(set2);
        difference.removeAll(set);


        System.out.println("Set 1 :"+set);
        System.out.println("Set 2 :"+set2);
        System.out.println("Union  :"+union);
        System.out.println("Intersection  :"+intersection);
        System.out.println("Difference  :"+difference);
    }
}
