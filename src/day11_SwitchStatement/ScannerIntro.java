package day11_SwitchStatement;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer");

       int num1 = keyboard.nextInt();

        System.out.println("Enter a decimal");

        double num2 = keyboard.nextDouble();

        System.out.println(num1);
       System.out.println(num2);

        System.out.println("Multiplication: " + (num1*num2));

        keyboard.close();

        /*System.out.println("Enter an integer");

        int n3 = keyboard.nextInt();

        System.out.println(n3);

    */
    }
}
