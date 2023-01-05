package day14_String.Practice;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {
        /*
         5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"


        HINT: 1. you need charAt() method
              2. Ascii Table
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String w1 = input.next();
        char ch = w1.charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("first character is uppercase letter");
        } else if (ch>=97 && ch<=122) {
            System.out.println("first character is lowercase letter");
        } else if (ch>=48 && ch<=57) {
            System.out.println("first character is digit");
        }else {
            System.out.println("first character is special character");
        }
    }
}
