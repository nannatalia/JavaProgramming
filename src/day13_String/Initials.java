package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String f = input.next();
        System.out.println("Please enter your second name");
        String s = input.next();

        char f1 = f.charAt(0);
        char s1 = s.charAt(0);
        String initial = f1 + "." + s1 + ".";
        System.out.println("initial = " + initial);
    }
}
