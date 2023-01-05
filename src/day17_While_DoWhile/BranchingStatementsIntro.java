package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatementsIntro {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
            if (i == 'F') {
                break;
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int n = input.nextInt();
            if (n < 0) {
                break;
            }
            System.out.print(n + " ");
        }
    }
}