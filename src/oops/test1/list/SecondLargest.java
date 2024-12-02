package oops.test1.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(25,45,4,98,67,77);

        System.out.println("Original list: " + list);

        Integer largest=Integer.MIN_VALUE;
        Integer secondLargest=Integer.MIN_VALUE;

        for(int num:list){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if (num>secondLargest && num<largest){
                secondLargest=num;
            }
        }

        if(secondLargest!=Integer.MIN_VALUE){
            System.out.println("Second largest element "+secondLargest);
        }else{
            System.out.println("Second largest element not exist");
        }
    }
}
