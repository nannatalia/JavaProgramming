package day21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {
        int[] numbers= {10,20,30,40,50,60};
        int sum = 0;
        for (int i : numbers) {
            sum+=i;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average number is: " + sum/ numbers.length);
    }
}
