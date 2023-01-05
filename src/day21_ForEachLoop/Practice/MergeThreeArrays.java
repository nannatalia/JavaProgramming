package day21_ForEachLoop.Practice;

import java.util.Arrays;

public class MergeThreeArrays {
    public static void main(String[] args) {
        /*
        5. Write a program that can merge 3 arrays of integers

    		Ex:
    			arr1 = {30, 10, 20};
    			arr2 = {15, 40, 25, 35};
    			arr3 = {8, 9, 17, 5, 4, 1}

			Output:
				{30,10,20,15,40,25,35,8,9,17,5,4,1}
         */
        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] result = new int[arr1.length + arr2.length + arr3.length];
        int j =0;
        for (int i : arr1) {
            result[j++] = i;
        }
        for (int i : arr2) {
            result[j++] = i;
        }
        for (int i : arr3) {
            result[j++] = i;
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }
}
