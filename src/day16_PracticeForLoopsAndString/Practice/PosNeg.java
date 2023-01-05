package day16_PracticeForLoopsAndString.Practice;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        /*
        1. Write a program that asks user to enter number for 5 times,
        and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
         */
        Scanner input = new Scanner(System.in);
        int r=0 ;
        int r2 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number five times:");
            int n = input.nextInt();
            if(n>0){
                r+=1;
            }else if(n<0){
                r2+=1;
            }
        }
        System.out.println(r + " positive and " + r2 + " negative");
    }
}
