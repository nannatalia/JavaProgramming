package day13_String.Practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        /*
        1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
         */
        Scanner input = new Scanner(System.in);
        String word = input.next();
        if (word.length()<5){
            System.out.println("Too short!");
        }else if (word.length()>5){
            System.out.println("Too long!");
        }else{
            char fifthChar = word.charAt(4);
            char fourthChar = word.charAt(3);
            char thirdChar = word.charAt(2);
            char secondChar = word.charAt(1);
            char firstChar = word.charAt(0);
            System.out.println(fifthChar + "" + fourthChar + "" + thirdChar + "" + secondChar + "" + firstChar);
        }
    }
}
