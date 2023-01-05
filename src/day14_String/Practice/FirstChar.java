package day14_String.Practice;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        /*
          1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String w1 = input.next();
        String w2 = input.next();
        System.out.println(w1.substring(1) + w2.substring(1));
    }
}
