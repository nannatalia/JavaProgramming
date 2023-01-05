package day15_ForLoops.Practice;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        /*
        4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        Scanner input = new Scanner(System.in);
        int nr = input.nextInt();
        int result = 1;
        for (int i = 1; i <=nr ; i++) {
            result*=i;
        }
        System.out.println(result);
    }
}
