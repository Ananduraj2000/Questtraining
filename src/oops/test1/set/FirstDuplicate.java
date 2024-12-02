package oops.test1.set;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
    public static void main(String[] args) {

        int [] numbers={2,4,2,5,6,4,7,3,4};

        Set<Integer> duplicate=new HashSet<Integer>();

        int firstDuplicate=-1;

        for(int num:numbers){
            if(duplicate.contains(num)){
                firstDuplicate=num;
                break;
            }
            duplicate.add(num);
        }

        if(firstDuplicate!=-1){
            System.out.println("First duplicate Number is :"+firstDuplicate);
        }else{
            System.out.println("Duplicate numbers are not found");
        }
    }
}
