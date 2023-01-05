package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] res = MergeTwoArray2(new int[]{1,2,3,4}, new int[]{5,6,7,8});
        System.out.println(Arrays.toString(res));
    }
    public static int[] MergeTwoArray2(int[] arr1, int[] arr2){
        int[] result = {};
        for (int i : arr1) {
            result = ArraysUtility.addElement(result,i);
        }
        for (int i : arr2) {
            result = ArraysUtility.addElement(result, i);
        }
        return result;
    }
}
