package day20_Arrays.Practice;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        /*
        6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

         */
        int[] numbers = {10, 0, 5, 0, 1, 0,0,77};
        int[] result = new int[numbers.length];
        Arrays.sort(numbers);
        for (int i = numbers.length - 1, j =0; i >= 0; i--, j++) {
            if(numbers[i] == 0){
                numbers[numbers.length-1] = numbers[i] ;
            }
            result[j]=numbers[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
