package day25_CustomMethod_Overloading.Practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] reversedArray1 = Reverse(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(reversedArray1));
        double[] reversedArray2 = Reverse(new double[]{1.2,3.4,5.6, 7.8});
        System.out.println(Arrays.toString(reversedArray2));
        char[] reversedArray3 = Reverse(new char[]{'A', 'B', 'C'});
        System.out.println(Arrays.toString(reversedArray3));
        String[] reversedArray4 = Reverse(new String[]{"Akica", "Natica"});
        System.out.println(Arrays.toString(reversedArray4));

    }
    public static int[] Reverse(int[] arr){
        int[] reversed = new int[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
         reversed[j++]=arr[i];
        }
        return reversed;
    }
    public static double[] Reverse(double[] arr){
        double[] reversed = new double[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
         reversed[j++]=arr[i];
        }
        return reversed;
    }
    public static char[] Reverse(char[] arr){
        char[] reversed = new char[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
         reversed[j++]=arr[i];
        }
        return reversed;
    }
    public static String[] Reverse(String[] arr){
        String[] reversed = new String[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
         reversed[j++]=arr[i];
        }
        return reversed;
    }
}
