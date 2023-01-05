package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        /*
        1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your gender:");
        String gender = input.next();
        input.nextLine();
        System.out.println("Enter your full name:");
        String fullname = input.nextLine();
        System.out.println("Enter your phone number:");
        long phone = input.nextLong();
        input.nextLine();
        System.out.println("Enter your zip code:");
        int zipcode = input.nextInt();
        input.nextLine();
        System.out.println("Enter your school name:");
        String school = input.nextLine();
        System.out.println("Enter your city name:");
        String city = input.nextLine();
        System.out.println("Enter your state name:");
        String state = input.next();
        input.nextLine();
        System.out.println("Enter your building number:");
        int building = input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name:");
        String street = input.nextLine();

        System.out.println();
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Fullname: " + fullname);
        System.out.println("Phone: " + phone);
        System.out.println("Adress: \n\t\t\t\t" + building + " " + street + "\n\t\t\t\t" + city + ", " + state + " " + zipcode);
        System.out.println("School: " + school);
        input.close();
    }
}