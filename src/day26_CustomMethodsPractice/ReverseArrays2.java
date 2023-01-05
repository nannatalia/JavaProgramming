package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArrays2 {
    public static void main(String[] args) {
     int[] res = ReverseArray2(new int[]{10,20,30,40});
        System.out.println(Arrays.toString(res));
    }
    public static int[] ReverseArray2(int[] arr){
        int[] reversed = {};
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed = ArraysUtility.addElement(reversed, arr[i]);
        }
        return reversed;
    }
}
