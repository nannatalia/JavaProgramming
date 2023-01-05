package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //EnterEnter

        System.out.println("Enter your full name:");
        String fullName = scan.nextLine(); //Java ProgrammingEnter

        System.out.println("Enter your building number:");
        String building = scan.next(); //7925A

        scan.nextLine(); //Enter

        System.out.println("Enter your Street name:");
        String street = scan.nextLine(); //Jones Branch DriveEnter

        System.out.println("Enter your city name:");
        String city = scan.nextLine(); // McLeanEnter

        System.out.println("Enter your state name:");
        String state = scan.next(); //VA

        System.out.println("Enter your zip code:");
        String zipCode = scan.next(); //22012

        scan.nextLine(); //EnterEnter

        System.out.println("Enter your country name: ");
        String country = scan.nextLine();

        System.out.println(fullName + "\n" + building + " " + street  + "\n" + city + ", " + state + " " + zipCode + "\n" + country);


        scan.close();

    }


}