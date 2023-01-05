package day19_LoopPractices;

public class UniqueChars {
    public static void main(String[] args) {
        /*

	2. Write a program that can find the unique characters from a string
	without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
         */
        String str = "aabccdeef";
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
            }
        }System.out.println(result);
    }
}
