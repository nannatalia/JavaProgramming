package day15_ForLoops.Practice;

public class Palindrome {
    public static void main(String[] args) {
        /*
        8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
         */
        String str = "Anna";

        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        boolean isPalindrome = str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);

    }
}
