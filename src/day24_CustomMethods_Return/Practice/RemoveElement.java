package day24_CustomMethods_Return.Practice;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        /*
        10. create a method named removeElement that passes one
         integer array and one integer, the method removes the integer
          index from the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
         */
        int[] res = removeElement(new int[]{10,20,30,40,50,60}, 3);
        System.out.println(Arrays.toString(res));
    }
    public static int[] removeElement(int[] arr, int index){
        int[] removed = new int[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            removed[j]=arr[i];
            j++;
        } return removed;
    }
}
