package day19_LoopPractices;

import java.util.Scanner;

public class Twice {
    public static void main(String[] args) {
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
            if(result.contains(ch+"")){
                continue;
            }
            if(count==2){
                result+=ch;
            }
        } System.out.println("The duplicated chars are: " + result);
    }
}
