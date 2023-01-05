package day17_While_DoWhile.Practice;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String answer = input.next();
        input.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Which type of room do you want?");
            String room = input.nextLine();
            while (!(room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") || room.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid room, please reenter");
                System.out.println("Which type of room do you want?");
                room = input.nextLine();
            }
                if (room.equalsIgnoreCase("King bed")) {
                    System.out.println("King bed: 120$");
                } else if (room.equalsIgnoreCase("Queen bed")) {
                    System.out.println("Queen bed: 100$");
                } else if (room.equalsIgnoreCase("single bed")) {
                    System.out.println("Single bed: 80$");
                } else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Have a nice day");
                }
            }
                while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                    System.out.println("Invalid answer, reenter");
                    System.out.println("Do you want to reserve a room?");
                    answer = input.next();
                    input.nextLine();
                }
                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("Which type of room do you want?");
                    String room = input.nextLine();
                    if (room.equals("King Bed")) {
                        System.out.println("King Bed: 120$");
                    } else if (room.equals("Queen Bed")) {
                        System.out.println("Queen Bed: 100$");
                    } else if (room.equals("single Bed: 80$")) {
                        System.out.println("single Bed: 80$");
                    }
                } else {
                    System.out.println("have a nice day");
                }
            }
        }
