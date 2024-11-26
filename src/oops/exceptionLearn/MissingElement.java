package oops.exceptionLearn;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,7,8,9,6};
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[arr.length + i] = arr[i] * 2;
        }
        Arrays.sort(newArr);
        System.out.println("Sorted Array: " + Arrays.toString(newArr));
        int start = newArr[0];
        int end = newArr[newArr.length - 1];


        int sum1 = 0;
        for (int i = start; i <= end; i++) {
            sum1 += i;
        }


        int sum2 = 0;
        for (int i = 0; i < newArr.length; i++) {
            sum2 += newArr[i];
        }


        int missingElement = sum1 - sum2;

        System.out.println("The missing element is: " + missingElement);

    }
}
