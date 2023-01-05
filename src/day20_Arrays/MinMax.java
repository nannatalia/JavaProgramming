package day20_Arrays;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        /*
        3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number
         */
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] =  input.nextInt(); //each user input will be assigned here to the indexes of the array number
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max)
                max = numbers[i];
            if(numbers[i]<min)
                min=numbers[i];
        }
        System.out.println("The maximum is: " + max);
        System.out.println("The minimum is: " + min);
    }
}
