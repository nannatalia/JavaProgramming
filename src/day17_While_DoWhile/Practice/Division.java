package day17_While_DoWhile.Practice;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int r = 0;
        while(n1>=n2) {
            n1=n1-n2;
            r+=1;
        }
        System.out.println(r);
    }
}
