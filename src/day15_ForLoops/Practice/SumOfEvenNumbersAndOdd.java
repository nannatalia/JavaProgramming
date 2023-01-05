package day15_ForLoops.Practice;

public class SumOfEvenNumbersAndOdd {
    public static void main(String[] args) {
        /*
        1. Write a program that can return the sum of even numbers between 1 to 100

	2. Write a program that can return the sum of odd numbers between 1 to 100
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
              sum+=i;
            }
        } System.out.println(sum);
        int sum2 = 0;
        for (int i = 1; i < 100; i++) {
            if(i%2!=0){
                sum2+=i;
            }
        }
        System.out.println(sum2);
    }
}
