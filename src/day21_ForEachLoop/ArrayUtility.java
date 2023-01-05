package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,};
        System.out.println(Arrays.toString(nums));
        String str = "Java";
        System.out.println(str);
        System.out.println("---------------------------------------");
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);
        System.out.println("---------------------------------------");
        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r3 = Arrays.equals(ch1,ch2);
        System.out.println(r3);
    }
}
