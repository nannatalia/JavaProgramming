package day15_ForLoops;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        /*
        1. Write a program that asks user to enter a word. If the work starts with x,
         replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

         */
        System.out.println("Enter a word");
        String s = new Scanner(System.in).next(); //xcodex

        if(s.charAt(0)=='x'){
            s = s.replaceFirst("x", "a");
            System.out.println(s);
        }

        System.out.println("-------------------------------------");

    }
}
