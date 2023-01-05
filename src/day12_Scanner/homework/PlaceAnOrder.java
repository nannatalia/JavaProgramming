package day12_Scanner.homework;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        /*
        6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String product = input.nextLine();
        System.out.println("Enter the price: ");
        double price = input.nextDouble();

        input.nextLine();

        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter your first name: ");
        String name = input.next();

        System.out.println(name + ", your order for " + quantity + " " + product + " has been placed. " + "Your total is " + (quantity*price));

        input.close();
    }
}
