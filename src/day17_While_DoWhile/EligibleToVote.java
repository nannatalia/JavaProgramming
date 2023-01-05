package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        while(!(age >=1 && age<=120)){
            System.err.println("Invalid age, reenter!");
            System.out.println("Enter your age: ");
            age = input.nextInt();
        }
        System.out.println("Are you an US citizen? yes/no");
        String answer = input.next();
        while(!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))){
            System.err.println("Invalid answer, reenter!");
            System.out.println("Are you an US citizen? yes/no");
            answer = input.next();
        }
        if(age>=18 && answer.equalsIgnoreCase("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Ineligible to vote");
        }
    }
}
