package day18_NestedLoop;

import java.util.Scanner;

public class Divide2Numbrs {
    public static void main(String[] args) {
        /*
            1.  Write a program that can divide two positive numbers without using
             / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reaminder of 2


                        a = 20
                        b = 6;


                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;
        while(num1>=num2){
            num1 -=num2;
            result++;
        }
        System.out.println(result + " with a remainder of " + num1);
    }
}
