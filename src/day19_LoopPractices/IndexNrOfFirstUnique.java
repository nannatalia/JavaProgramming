package day19_LoopPractices;

import java.util.Scanner;

public class IndexNrOfFirstUnique {
    public static void main(String[] args) {
        /*
        4. Write a program that can return the index number of the first unique character.

         */
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch == ch2) {
                    count++;
                }
            }
            if(count==1){
                result+=ch;
                break;
            }
        }System.out.println("The index of the first unique char is " + str.indexOf(result));
    }
}
