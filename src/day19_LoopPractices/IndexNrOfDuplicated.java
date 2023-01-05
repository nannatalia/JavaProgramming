package day19_LoopPractices;

import java.util.Scanner;

public class IndexNrOfDuplicated {
    public static void main(String[] args) {
        /*
        2. Write a program that cna return the index number of the first duplicated character from a string
         */
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if(ch==ch2){
                    count++;
                }
            }
            if(count==2){
                result+=ch;
                break;
            }
        } System.out.println("The first duplicated char's index is: " + str.indexOf(result));
    }
}
