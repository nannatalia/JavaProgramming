package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        for(char s : str.toCharArray()){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------");
        String sentence= "Wooden Spoon";
        String[] result = sentence.split(" ");
        System.out.println(Arrays.toString(result));
        System.out.println("------------------------------------------");
        String email = "WoodenSpoon@Cydeo.com";
        String[] result2 = email.split("@");
        System.out.println(Arrays.toString(result2));
        System.out.println("------------------------------------------");
        String s = "Today is nice day. Today is Monday. Today we learn Java";
        String[] result3 = s.split("\\.");
        System.out.println(Arrays.toString(result3));
    }
}
