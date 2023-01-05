package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter your age");
            int age = input.nextInt();
            while(!(age>=1 && age<=120)){
                System.out.println("Invalid entry,reenter");
                age = input.nextInt();
            }
            System.out.println("Would you like to continue");
            String answer = input.next().toLowerCase();
            while (!(answer.equals("no") || answer.equals("yes"))){
                System.out.println("Invalid entry, reenter");
                answer = input.next().toLowerCase();
            }
            if(answer.equals("no")){
                break;
            }
        }
    }
}
