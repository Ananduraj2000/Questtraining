package oops.test1.set;

import java.util.HashSet;
import java.util.Set;

public class IntegerContains {

    //Check if a Set<Integer> contains all the elements of another Set<Integer>.
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<Integer>();
        Set<Integer> set2=new HashSet<Integer>();

        set1.add(56);
        set1.add(44);
        set1.add(33);
        set1.add(47);

        set2.add(56);
        set2.add(44);
        set2.add(33);
        set2.add(47);

        System.out.println("\nChecking for equal elements");
        if(set1.containsAll(set2)) {
            System.out.println("Equal elements found");
        }else{
            System.out.println("Not equal elements found");
        }
    }
}
