package day19_LoopPractices;

public class FrequencyOfChars {
    public static void main(String[] args) {
    /*
    1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
     */
        String str = "aabcccda";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                if(ch==each){
                    count++;
                }
            }
            if(result.contains(ch+"")){
                continue;
            }
            result += str.charAt(i);
            result += count;
        }
        System.out.println(result);
    }
}
