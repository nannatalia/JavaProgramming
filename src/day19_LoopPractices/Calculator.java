package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1 = input.nextInt();
        System.out.println("Enter a math operator");
        String operator = input.next();
        if (!(operator=="+" || operator=="-")){
            System.err.println("Invalid operator");
            System.exit(0);
        }
        System.out.println("Enter a number");
        int n2 = input.nextInt();
    }
}
