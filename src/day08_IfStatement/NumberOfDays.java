package day08_IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
        /*
        3. Write a program that can print the number of days in a month
Ex:
number = 1 ~ 12;
output:
31 Days
Hints:
Months that has 31 days: 1, 3, 5, 7, 8,
10, 12
Months that has 30 days: 4, 6, 9, 11
Month that has 28 days: 2

         */
        int number = 5;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 || number == 6 || number==9 || number == 11;
        boolean has31Days = !has30Days && !has28Days && number <=12;

        if(has28Days){
            System.out.println("28");
        }
        if(has30Days){
            System.out.println("30");
        }
        if(has31Days){
            System.out.println("31");
        }
    }

}
