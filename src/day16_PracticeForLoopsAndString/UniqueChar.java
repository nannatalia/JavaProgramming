package day16_PracticeForLoopsAndString;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        /*
        	3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1


				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2

         */
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String result = "";
        for (int i = 0; i < word.length() ; i++) {
            String ch = "" + word.charAt(i);
            if(word.indexOf(ch) == word.lastIndexOf(ch)){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
