package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {
        String[] students ={"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3);
        System.out.println(Arrays.toString(earlyBirds));
        int[] nr = {1,2,3,4,5,6,7,8,9,10};
        nr = Arrays.copyOf(nr, 5);
        System.out.println(Arrays.toString(nr));
        System.out.println("-------------------------------------------------");
        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char[] ch2 = Arrays.copyOfRange(ch1, 2,7);
        System.out.println(Arrays.toString(ch2));
        int[] scores = {10,20,30,40,50,60,70,80,90,100};
        int[] result = Arrays.copyOfRange(scores, 3, 8 );
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(scores, 3, scores.length);
        System.out.println(Arrays.toString(result2));
    }
}
