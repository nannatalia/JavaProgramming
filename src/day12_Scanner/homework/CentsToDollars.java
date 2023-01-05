package day12_Scanner.homework;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        /*
        3. Write a program that can convert cents to dollars,
        if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();
        int dollar = cents/100;
        int rest = cents%100;

        System.out.println(cents + " cents equal to : " + dollar + " dollars and " + rest + "cents");
    }
}
