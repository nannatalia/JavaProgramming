package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        String cat = "cat";
        String dog = "dog";
        int frcat = 0 ;
        int frdog = 0;
        int length = sentence.length();
        for (int i = 0; i < length-2; i++) {
            String s = sentence.substring(i,i+3);
            if(s.contains(cat)){
                ++frcat;
            } else if (s.contains(dog)) {
                ++frdog;
            }
        }
        System.out.println("Frequency of cats: " + frcat);
        System.out.println("Frequency of dogs: " + frdog);
    }
}
