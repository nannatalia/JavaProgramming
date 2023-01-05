package day21_ForEachLoop;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] numbers = {-1,5,7,33,8};
        int min =numbers[0];
        for (int each : numbers) {
            if(each<min)
                min = each;
        }
        System.out.println(min);
    }
}
