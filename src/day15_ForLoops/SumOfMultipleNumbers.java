package day15_ForLoops;


import java.util.Scanner;

public class SumOfMultipleNumbers {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < 101 ; i++) {
            sum +=i;
        }
        System.out.println(sum);

        System.out.println("---------------------------------------------------");
        int sum1 = 0;
        Scanner input = new Scanner(System.in);
        for(int i =0; i<5; i++){
        System.out.println("Enter a number");
       sum1 += input.nextInt();

        } System.out.println(sum1);
        input.close();
    }
}
