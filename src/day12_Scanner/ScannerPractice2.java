package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  System.out.println("Enter true or false");
        //boolean r = input.nextBoolean();
        System.out.println("Enter your name:");
        String name = input.nextLine(); // till the first space
        System.out.println("name = " + name);
        input.close();
    }
}
