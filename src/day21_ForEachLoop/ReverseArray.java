package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbrs = {10,20,30,40,50,60,70,80};
        int[] reversed = new int[numbrs.length];
        for (int i = numbrs.length - 1, j=0; i >= 0; i--, j++) {
            reversed[j] = numbrs[i];
        }
            System.out.println(Arrays.toString(reversed));
        }

    }

