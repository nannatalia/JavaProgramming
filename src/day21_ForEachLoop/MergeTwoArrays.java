package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] grup1 = {"Akos" , "Alexa", "Aydin", "Maya", "Ana"};
        String[] grup2 = {"Alex", "Maria"};
        String[] students = new String[grup1.length + grup2.length];
        int i = 0;
        for (String s : grup1) {
            students[i++] =s;
        }

        for (String s : grup2) {
            students[i++]=s;
        }
        System.out.println(Arrays.toString(students));
    }
}
