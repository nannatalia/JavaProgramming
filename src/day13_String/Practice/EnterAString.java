package day13_String.Practice;

import java.util.Scanner;

public class EnterAString {
    public static void main(String[] args) {
        /*
        5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = input.nextLine();
        int len = word.length();
        if(word.isEmpty()){
            System.out.println("String is empty");
        } else if (len > 3) {
            System.out.println(word.substring(len-3));
        } else{
            System.out.println(word);
        }

    }
}
