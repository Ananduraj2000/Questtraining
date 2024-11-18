package com.quest.practice.vars;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8};

        int largest = arr[0];
        int secondLargest = arr[0];
        int i = 1;

        while (i < arr.length) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
            i++;
        }

        System.out.println("Second largest element is :"+secondLargest);
    }
}

