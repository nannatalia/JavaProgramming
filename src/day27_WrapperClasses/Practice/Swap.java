package day27_WrapperClasses.Practice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        /*
        2. Swap Task:
	2.1 Create a method named swap that passes three parameters:
	 integer array, integer i, integer j. the method swaps the element
	 at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array

         */
        int[] res = swap(new int[]{10,20,30,40,50}, 2,4);
        System.out.println(Arrays.toString(res));
    }
    public static int[] swap(int[] arr, int i , int j){
        int nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }
    public static double[] swap(double[] arr, int i , int j){
        double nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }
    public static char[] swap(char[] arr, int i , int j){
        char nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }
    public static String[] swap(String[] arr, int i , int j){
        String nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }
}
