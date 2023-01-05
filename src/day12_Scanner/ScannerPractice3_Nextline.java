package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_Nextline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your fullname: ");
        String name = input.nextLine(); // other than next line, the enter is in the scanners memory

        System.out.println("Enter your programming language");
        String programmingLanguage = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // it takes out the enter key from the scan

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("name = " + name);
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
