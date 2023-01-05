package day24_CustomMethods_Return.Practice;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        /*
          6. create a method named addElement that takes one
          integer array and one integer, the method can add the Integer
          number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
         */
        int[] res = addElement(new int[]{1,2,3}, 4);
        System.out.println(Arrays.toString(res));
    }
    public static int[] addElement(int[] arr, int num){
        int[] result = new int[arr.length+1];
        for (int i = 0, j =0; i < result.length-1; i++,j++) {
            result[i]=arr[j];
            result[result.length-1]=num;
        }
        return result;
    }
}
