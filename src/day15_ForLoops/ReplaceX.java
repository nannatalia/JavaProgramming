package day15_ForLoops;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        /*
        2. Write a program that asks user to enter a word. and replace all the x or X
         with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */
        System.out.println("Enter a word");
        String s = new Scanner(System.in).next();
        s = s.replace("x", "a").replace("X","a");
        System.out.println(s);
    }
}
