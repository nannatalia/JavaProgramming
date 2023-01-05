package day18_NestedLoop.Practice;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        /*
        3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
         */
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first number:");
            int n1 = input.nextInt();
            System.out.println("Enter a math operator:");
            String operator = input.next();
            while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
                System.err.println("Invalid entry");
                System.out.println("Enter a math operator:");
                operator = input.next();
            }
            System.out.println("Enter the second number:");
            int n2 = input.nextInt();
            if (operator.equals("+")) {
                System.out.println((n1 + n2));
            } else if (operator.equals("-")) {
                System.out.println((n1 - n2));
            } else if (operator.equals("*")) {
                System.out.println((n1 * n2));
            } else {
                System.out.println((n1 / n2));
            }
            System.out.println("Do you want to continue?");
            String answer = input.next().toLowerCase();
            while (!(answer.equals("no") || answer.equals("yes"))){
                System.err.println("Invalid entry");
                System.out.println("Do you want to continue?");
                answer = input.next().toLowerCase();
            }
            if(answer.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }
    }
}
