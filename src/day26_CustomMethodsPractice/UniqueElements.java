package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr1 = CountUniqueElements(new int[]{1,2,2,3,4,55,55});
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] CountUniqueElements(int[] arr){
        int[] result = {};
        for (int i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
               result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }
    public static double[] CountUniqueElements(double[] arr){
        double[] result = {};
        for (double i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
               result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }
    public static char[] CountUniqueElements(char[] arr){
        char[] result = {};
        for (char i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
               result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }
    public static String[] CountUniqueElements(String[] arr){
        String[] result = {};
        for (String i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
               result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }
}
