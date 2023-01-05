package day15_ForLoops.Practice;

import java.util.Scanner;

public class SumOfAnyNumber {
    public static void main(String[] args) {
/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();
        for (int i = 1; i <= nr ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
