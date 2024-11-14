package com.quest.practice.vars;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array={1,3,4,1,5,6,3};

        System.out.println("Duplicate elements are: ");
        int i=0;
        while(i<array.length){
            int j=i+1;
            while (j<array.length){
                if(array[i]==array[j]){
                    System.out.println(array[i]);
                    break;
                }
                j++;
            }
            i++;
        }
    }
}
