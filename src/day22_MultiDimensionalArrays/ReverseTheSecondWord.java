package day22_MultiDimensionalArrays;

public class ReverseTheSecondWord {
    public static void main(String[] args) {
        /*

	2. Write a program that can reverse the second word of the sentence
			Ex:


			output:
				I evoL Java

         */
        String sentence = "I Love Java";
        String[] str = sentence.split(" ");
        String result = "";
        String second = str[1];
        for (int i = second.length() - 1; i >= 0; i--) {
            result+=second.charAt(i);
        }
        System.out.println(sentence.replace(second, result));
    }
}
