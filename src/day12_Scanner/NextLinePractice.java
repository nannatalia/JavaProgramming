package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your fullname");
        String fullname = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullname = " + fullname);

        input.close();
    }
}
