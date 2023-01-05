package day15_ForLoops.Practice;

import java.util.Scanner;

public class Retrive {
    public static void main(String[] args) {
        /*
        5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String r = "";
        String r2 = "";
        String r3 = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if((ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z')){
                r+=ch;
        } else if (ch>='0' && ch<='9') {
                r2+=ch;
            }else {
                r3+=ch;
            }
        }
        System.out.println("letters: "+ r);
        System.out.println("digits: " + r2);
        System.out.println("special chars: " + r3);
    }
}
