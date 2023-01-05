package day25_CustomMethod_Overloading.Practice;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        /*
        Task1:
	1. create a method that can merge two integer arrays.

	2. create a method that can merge two double arrays.

	3. create a method that can merge two char arrays.

	4. create a method that can merge two String arrays.

         */
        int[] twoArray = mergeArrays(new int[]{1,2,3}, new int[]{4,5,6});
        System.out.println(Arrays.toString(twoArray));
        double[] twoArray2 = mergeArrays(new double[]{1.2,3.4,4.5}, new double[]{6.7,8.9});
        System.out.println(Arrays.toString(twoArray2));
        char[] twoArray3 = mergeArrays(new char[]{'a','b'}, new char[]{'c','d','e'});
        System.out.println(Arrays.toString(twoArray3));
        String[] twoArray4 = mergeArrays(new String[]{"Akica", "Natica"}, new String[]{"Milica"});
        System.out.println(Arrays.toString(twoArray4));
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] merge2arrays = new int[arr1.length+ arr2.length];
        int j = 0;
        for (int i : arr1) {
            merge2arrays[j++]=i;
        }
        for (int i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }
    public static double[] mergeArrays(double[] arr1, double[] arr2){
        double[] merge2arrays = new double[arr1.length+ arr2.length];
        int j = 0;
        for (double i : arr1) {
            merge2arrays[j++]=i;
        }
        for (double i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }
    public static char[] mergeArrays(char[] arr1, char[] arr2){
        char[] merge2arrays = new char[arr1.length+ arr2.length];
        int j = 0;
        for (char i : arr1) {
            merge2arrays[j++]=i;
        }
        for (char i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }
    public static String[] mergeArrays(String[] arr1, String[] arr2){
        String[] merge2arrays = new String[arr1.length+ arr2.length];
        int j = 0;
        for (String i : arr1) {
            merge2arrays[j++]=i;
        }
        for (String i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }
}
