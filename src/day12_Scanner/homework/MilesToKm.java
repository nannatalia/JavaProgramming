package day12_Scanner.homework;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        /*
        4. Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = input.nextDouble();
        double km = miles * 1.609;

        System.out.println(miles + " miles are equal to " + km + " kilometers");

        input.close();
    }
}
