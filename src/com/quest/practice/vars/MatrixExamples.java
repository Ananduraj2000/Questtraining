package com.quest.practice.vars;

import java.util.Arrays;

public class MatrixExamples {
    public static void matrixEx(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
        }
    }
    public static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static int[] sortArray(int[] array) {
        Arrays.sort(array);
        return array;
    }


    public static void main(String[] args) {
        int [][] mat={
                {1,2},
                {5,6},
                {9,10}
        };
        matrixEx(mat);
        System.out.println();

        int [] array={1,2,3,4};
        int valueSearch=4;
        int index=searchArray(array,valueSearch);


        if(index!=-1){
            System.out.println("Value found at the index :"+index);
        }else {
            System.out.println("Value not found");
        }

        int[] sortArray=sortArray(array);
        System.out.println("sorted array "+sortArray);
    }
}
