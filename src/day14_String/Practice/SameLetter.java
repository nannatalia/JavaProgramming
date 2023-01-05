package day14_String.Practice;

import java.util.Scanner;

public class SameLetter {
    public static void main(String[] args) {
        /*
         4. Ask user to enter two words. Then add them together and print.
    But if the last letter of the first word and the first letter of the last word is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        String w1 = input.next();
        String w2 = input.next();
        int length1 = w1.length();
        char ch1 = w1.charAt(length1-1);
        char ch2 = w2.charAt(0);
        if(ch1==ch2){
            System.out.println(w1 + w2.substring(1));
        }else {
            System.out.println(w1 + w2);
        }
    }
}
