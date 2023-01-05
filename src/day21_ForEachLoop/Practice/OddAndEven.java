package day21_ForEachLoop.Practice;

public class OddAndEven {
    public static void main(String[] args) {
        /*
        2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
         */
        int[] numbers = {1,2,3,4,5};
        int count1 = 0;
        int count2 = 0;
        for (int i : numbers) {
            if(i%2==0) {
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("The number of evens : " + count1);
        System.out.println("The number of odds : " + count2);
    }
}
