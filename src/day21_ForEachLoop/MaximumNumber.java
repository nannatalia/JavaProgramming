package day21_ForEachLoop;

public class MaximumNumber {
    public static void main(String[] args) {

        int[] numbers= {10,5,4,20,39,0};
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);

    }
}
