package com.quest.practice.vars;

import java.util.Arrays;

public class Replacement {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 7, 8};

        int totalSum = 0;
        for (int num : array) {
            totalSum += num;
        }


        for (int i = 0; i < array.length; i++) {
            array[i] = totalSum - array[i];

        }
        System.out.print(Arrays.toString(array) + " ");



    }
}
