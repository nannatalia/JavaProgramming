package day15_ForLoops;

import java.util.Scanner;

public class vfhbvdkh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exists = false;
        String word = input.next();
        if (word.length()<4) {
            System.out.println(exists);
        }else{
            boolean result = word.substring(0,4).contains("java") ||word.substring(1,5).contains("java");
            System.out.println(result);
        }
    }
}
