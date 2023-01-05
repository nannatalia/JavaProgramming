package day19_LoopPractices.Practice;

import java.util.Scanner;

public class AriaAndPerimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*

	3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program
				after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying
				the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

         */
        while (true) {
            System.out.println("Enter the length of the Rectangle:");
            int length = input.nextInt();
            if (length <= 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }
            System.out.println("Enter the width of the Rectangle:");
            int width = input.nextInt();
            if (width <= 0) {
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }
            System.out.println("The area of the rectangle is: " + (width * length));
            System.out.println("The perimeter of the rectangle is: " + (2 * (width + length)));
            System.out.println("Would you like to continue?");
            String answer = input.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid entry, reenter");
                answer = input.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }
        }input.close();
    }
}
