package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Would you like to continue?");
            String answer = input.next();
            while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry, reenter");
                answer = input.next();
            }
            if(answer.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}