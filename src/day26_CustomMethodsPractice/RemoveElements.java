package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int[] res = RemoveElement(new int[]{10,20,30,40},3);
        System.out.println(Arrays.toString(res));
    }
    public static int[] RemoveElement(int[] arr, int index){
        int[] arr2 = new int[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
    public static double[] RemoveElement(double[] arr, int index){
        double[] arr2 = new double[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
    public static char[] RemoveElement(char[] arr, int index){
        char[] arr2 = new char[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
    public static String[] RemoveElement(String[] arr, int index){
        String[] arr2 = new String[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
}
