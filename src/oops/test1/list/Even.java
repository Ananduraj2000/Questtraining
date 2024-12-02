package oops.test1.list;

import java.util.ArrayList;

public class Even {
    public static void main(String[] args) {
        int [] even={2,5,6,8,4,5,9};

        ArrayList<Integer> al=new ArrayList<>();

        for(int num:even){
            al.add(num);
        }

        System.out.println("Orginal List is : "+al);

        al.removeIf(num->num%2==0);
        System.out.println("Updated list is : "+al);
    }
}
