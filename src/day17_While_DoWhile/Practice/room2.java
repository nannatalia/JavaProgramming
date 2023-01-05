package day17_While_DoWhile.Practice;

import java.util.Scanner;

public class room2 {
        public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            System.out.println("Do you want to reserve a room?");
            String answer = scan.next().toLowerCase();

            String roomType = "";


            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.out.println("invalid entry please re-enter ");
                System.out.println("Do you want to reserve a room?");
                answer = scan.next().toLowerCase();
            }

            if (answer.equals("yes")) {
                System.out.println("which type of room the do you wants to reserve.");
                roomType = scan.next().toLowerCase();

                while (!(roomType.equals("King Bed") || roomType.equals("Queen Bed") || roomType.equals("single Bed"))) {
                    System.out.println("Invalid room! Please reselect the room: ");
                    System.out.println("which type of room the do you wants to reserve.");
                    roomType = scan.next().toLowerCase();
                }
                if (roomType.equals("King Bed")) {
                    System.out.println("Your total price is : $120");
                }
                if (roomType.equals("Queen Bed")) {
                    System.out.println("Your total price is : $100");
                }
                if (roomType.equals("single Bed")) {
                    System.out.println("Your total price is : $80");
                }


            } else {
                System.out.println("have a nice day");
            }
            scan.close();
        }
    }

