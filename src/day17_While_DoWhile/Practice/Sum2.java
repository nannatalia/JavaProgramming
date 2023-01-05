package day17_While_DoWhile.Practice;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = 0;
        while(true){
            int n = input.nextInt();
            if(n<0){
                break;
            }r +=n;
        }
        System.out.println(r);
    }
}
