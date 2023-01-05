package day22_MultiDimensionalArrays.Practice;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        /*
        1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
         */
        int[][] array = { {1,2,3}, {4,5,6}};
        int[][] reverse = new int[2][];
        for (int i = array.length - 1,x=0; i >= 0; i--, x++) {
            reverse[x] = new int[array[i].length];
            for (int i1 = array[i].length -1, j = 0; i1 >= 0; i1--, j++) {
                reverse[x][j]= array[i][i1];
            }
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}
