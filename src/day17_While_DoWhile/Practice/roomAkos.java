package day17_While_DoWhile.Practice;

import java.util.Scanner;

public class roomAkos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to reserve a room ?");
        String answer = input.next().toLowerCase();
        input.nextLine();

        if (answer.equals("yes")) {
            System.out.println("Which type of room?");
            String room = input.nextLine();

            while (!(room.equals("King Bed") || room.equals("Queen Bed") || room.equals("single Bed"))) {
                System.err.println("Invalid Room type please re-enter");
                room = input.nextLine();
            }
            if (room.equals("King Bed")) {
                System.out.println("King Bed: 120$");
            } else if (room.equals("Queen Bed")) {
                System.out.println("Queen Bed: 100$");
            } else if (room.equals("single Bed: 80$")) {
                System.out.println("single Bed: 80$");
            } else if (answer.equals("no")) {
                System.out.println("have a nice day");
            }
        }

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid Answer, Please re-enter");
            answer = input.next().toLowerCase();
            input.nextLine();
        }
        if (answer.equals("yes")) {
            System.out.println("Which type of room?");
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
