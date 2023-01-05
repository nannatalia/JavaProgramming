package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {
        int[] nr= {10,20,50,70};
        System.out.println(Arrays.toString(nr));
        System.out.println("---------------------------------------");
        int[] scores = new int[5];
        scores[0] = 65;
        scores[1] = 85;
        scores[2] = 55;
        scores[3] = 75;
        scores[scores.length-1] = 95;
        System.out.println( Arrays.toString(scores)); //to string convert the array to a string
    }
}
