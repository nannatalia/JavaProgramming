package day21_ForEachLoop.Practice;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {
        /*
        1. Write a program that sort the array of integer in descending order
         */
        int[] numbers = {7,123,3,4,5};
        int[] descending = new int[numbers.length];
        Arrays.sort(numbers);
        for (int i = numbers.length - 1, j =0 ; i >= 0; i--, j++) {
            descending[i] = numbers[j];
        }
        System.out.println(Arrays.toString(descending));
    }
}
