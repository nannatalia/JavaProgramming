package day15_ForLoops;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int minimum = 2147483647;
        for(int i = 0; i<5; i++ ){
            System.out.println("Enter a number");
            int num = input.nextInt();
            if(num<minimum){
                minimum=num;
            }

        }
        System.out.println("minimum = " + minimum);
    }
}
