package day25_CustomMethod_Overloading;
import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        ArraysUtility.PrintEach(arr1);
        System.out.println("---------------------------------");
        double[] arr2 = {1.2, 3.4, 5.6};
        ArraysUtility.PrintEach(arr2);
        System.out.println("---------------------------------");
        char[] arr3 = {'a', 'b', 'c', 'd'};
        ArraysUtility.PrintEach(arr3);
        System.out.println("---------------------------------");
        String[] arr4 = {"Akica", "Milica", "Natica"};
        ArraysUtility.PrintEach(arr4);
        System.out.println("---------------------------------");
        int[] arr5 = {1,2,3,4,5,6,8};
        int maxNr = ArraysUtility.max(arr5);
        System.out.println(maxNr);
        System.out.println("---------------------------------");
        double[] arr6 = {2.3, 4.5, 6.7, 8.9};
        double max2 = ArraysUtility.max(arr6);
        System.out.println(max2);
        System.out.println("---------------------------------");
        int[] arr7 = {1,2,3,4,5,6,7,8,9};
        boolean doContain = ArraysUtility.contains(arr7, 0);
        System.out.println(doContain);
        int[] arr8 = {1,2,3,4,5};
        int[] res = ArraysUtility.addElement(arr8, 6);
        System.out.println(Arrays.toString(res));
    }
}
