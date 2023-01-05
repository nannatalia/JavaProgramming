package day24_CustomMethods_Return.Practice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        /*
        8. Create method named reverse that passes an integer array parameter,
        the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}
         */
        int[] res = reverse(new int[]{10,20,30,40});
        System.out.println(Arrays.toString(res));
    }
    public static int[] reverse(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = arr.length - 1,j=0; i >= 0; i--, j++) {
            reversed[j]=arr[i];
        }
        return reversed;
    }
}
