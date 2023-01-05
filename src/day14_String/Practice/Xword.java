package day14_String.Practice;

import java.util.Scanner;

public class Xword {
    public static void main(String[] args) {
        /*

    3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String w1 = input.next();
        if(w1.startsWith("x")){
            System.out.println(w1.substring(1));
        }else {
            System.out.println(w1);
        }


    }
}
