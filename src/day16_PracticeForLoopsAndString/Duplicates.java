package day16_PracticeForLoopsAndString;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        /*

	2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding
         */
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String r1 = "";
        for (int i = 0; i < word.length() ; i++) {
            String r = "" + word.charAt(i);
            if(!r1.contains(r)){
                r1+=r;
            }else {
                r1 = r1;
            }
        }
        System.out.println(r1);
    }
}
