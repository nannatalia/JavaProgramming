package day20_Arrays;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        /*
        4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
         */
        int[] numbers = {10,20,30,40,50,60};
        double sum = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double averageNr = sum/(numbers.length);
        System.out.println("The average numbers is: " + averageNr);
    }
}
