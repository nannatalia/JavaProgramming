package day16_PracticeForLoopsAndString.Practice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        /*


3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int r = 0;
        for (int i = 1; i <= n1; i++) {
            r +=n2;
        }
        System.out.println(r);
    }
}
