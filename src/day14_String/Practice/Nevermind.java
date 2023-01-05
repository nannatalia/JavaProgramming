package day14_String.Practice;

import java.util.Scanner;

public class Nevermind {
    public static void main(String[] args) {
        /*
           2. ask the user to enter a word.
            if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String w1 = input.next();
        if(w1.endsWith("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }
    }
}
