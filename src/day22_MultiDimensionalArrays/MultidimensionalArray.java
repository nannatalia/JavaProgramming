package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[] arr1= {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};
        int[][] numbers = new int[3][];
        numbers[0] = arr1;
        numbers[1] = arr2;
        numbers[2] = arr3;

        // 3D contains 2 dimensional arrays
        int[][][] nr = {{{1,2,3}, {2,35,5}}, {{2,3,4,5}}, {{5,4,2,3}}};
        System.out.println(Arrays.deepToString(nr));
        System.out.println(Arrays.deepToString(nr[0]));
        System.out.println(Arrays.toString(nr[0][1]));
        System.out.println(nr[0][1][1]);

        for (int[][] number : nr) {
            for (int[] ints : number) {
                for (int i : ints) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
