package day16_PracticeForLoopsAndString.Practice;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        /*

2. Write a program that asks user to entera string and a char,
the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("Enter a character");
        String ch = input.next();
        int r = 0;
        for (int i = 0; i < str.length(); i++) {
            String ch1 = "" + str.charAt(i);
            if(ch1.equals(ch)){
                r+=1;
            }
        }
        System.out.println(r);
    }
}
