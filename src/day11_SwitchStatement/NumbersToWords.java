package day11_SwitchStatement;

public class NumbersToWords {
    public static void main(String[] args) {
        /*
        2. Write a program that can convert numbers 0~9 to words.
         */
        int n = 5;
        String r = (n>=1 && n<=9)? (n==1)? "One" :(n==2)? "Two" :(n==3)? "Three" :(n==4)? "Four"
                :(n==5)? "Five" :(n==6)? "Six" :(n==7)? "Seven" :(n==8)? "Eight" : "Nine" : "Invalid number";
        System.out.println(r);
    }
}
