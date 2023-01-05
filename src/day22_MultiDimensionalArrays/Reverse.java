package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        /*
        1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
         */
        String sentence = "Today is a good day to learn Java";
        String[] str = sentence.split(" ");
        String result = "";
            for(int j = str.length-1; j>=0; j--){
                    result+=str[j] + " ";
            }
        System.out.println(result);
        }
    }
