package day13_String.Practice;

import java.util.Scanner;

public class Longest {
    public static void main(String[] args) {
        /*
        2. write a program that asks user to enter two strings, and print out the longest string
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 strings");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1>l2){
            System.out.println(s1);
        }else{
            System.out.println(s2);
        }
    }
}
