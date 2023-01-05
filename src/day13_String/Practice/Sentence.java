package day13_String.Practice;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        /*
        1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        char s1 = sentence.charAt(0);
        int lenght1 = sentence.length();
        char last = sentence.charAt(lenght1-1);
        System.out.println(s1);
        System.out.println(last);
    }
}
