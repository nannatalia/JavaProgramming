package day16_PracticeForLoopsAndString.Practice;

import java.util.Scanner;

public class FrequencyOfWord {
    public static void main(String[] args) {
        /*
        4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        String word = "Java";
        int frequency = 0;
        int length = sentence.length();
        for (int i = 0; i < length-3; i++) {
            String s = sentence.substring(i, i + 4);
                if (s.contains(word)) {
                    frequency += 1;
            }
        }
        System.out.println(frequency);
    }
}