package day19_LoopPractices;

import java.util.Scanner;

public class clclclcl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if (result.contains(ch1 + "")) {
                continue;
            }
            result += ch1;

        }
        return result;

    }
}
