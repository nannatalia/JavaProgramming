package day09_IfStatement;

public class MinNumber {
    public static void main(String[] args) {
        /*
        1. Create a class called MinNumber, Write a program that can print
the minimum number between two numbers, if both are equal then print Equal
Ex:
n1= 100, n2 = 200;
output:
100 is the minimum number
n1 & n2
possibility #1: n1 is Min
possibility #2: n2 is Min
possibility #3: equal
         */
        int number1 = 12;
        int number2 = 5;
        boolean min1 = number1 > number2;
        if(min1){
            System.out.println(number2 + " is min");
        }
        boolean min2 = number2 > number1;
        if(min2){
            System.out.println(number1 + " is min");
        }
        boolean equal = number1==number2;
        if(equal){
            System.out.println(number1 + " and " + number2 + " are equal");
        }
    }
}
