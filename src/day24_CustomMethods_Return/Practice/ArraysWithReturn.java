package day24_CustomMethods_Return.Practice;

import java.util.Arrays;

public class ArraysWithReturn {
    public static void main(String[] args) {
        /*
        2. create a method that can return the maximum number from an array of integers

	3. create a method that can return the minimum number from an array of integers
	4. create a method that return the reversed array
					{1,2,3,4,5} === > {5,4,3,2,1}


	5. create a method that can merge two arrays and returnj the new array
				arr1 = {1,2,3}
				arr2 = {4,5}

				{1,2,3,4,5}

         */
        int maxNr = maximum(new int[]{1,2,3,4,5});
        System.out.println(maxNr);
        int minNr = minimum(new int[]{-4,-56,2,3,4,5,6});
        System.out.println(minNr);
        int[] reverseArray = reversed(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(reverseArray));
        int[] mergeTwo = merge(new int[]{1,2,3}, new int[] {4,5,6});
        System.out.println(Arrays.toString(mergeTwo));
    }
    public static int maximum(int[] arr1){
        int max = arr1[0];
        for (int i : arr1) {
            if(i>max){
                max=i;
            }
        }return max;
    }
    public static int minimum(int[] arr2){
        int min = arr2[0];
        for (int i : arr2) {
            if(i<min){
                min=i;
            }
        }return min;
    }
    public static int[] reversed(int[] arr3){
        int[] reverse = new int[arr3.length];
        for (int i = arr3.length - 1, j=0; i >= 0; i--, j++) {
            reverse[j]=arr3[i];
        }return reverse;
    }
    public static int[] merge(int[] arr4, int[] arr5){
        int[] total = new int[arr4.length+ arr5.length];
        int j = 0;
        for (int i : arr4) {
            total[j++] = i;
        }for (int i1 : arr5) {
            total[j++] = i1;
        }return total;
    }
}
