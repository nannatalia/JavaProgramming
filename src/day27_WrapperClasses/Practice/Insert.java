package day27_WrapperClasses.Practice;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        /*
        1. Insert Task:
		1.1 Create a method named insert that passes three parameters:
		integer array, integer index, integer element.
		the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

         */
        int[] res = insert(new int[]{1,2,3,4,5}, 2,100);
        System.out.println(Arrays.toString(res));
    }
    public static int[] insert(int[] arr, int index, int newElement){
        int[] inserted = new int[arr.length+1];
        for (int i = 0; i < arr.length+1; i++) {
            if(i<index){
                inserted[i]=arr[i];
            }
            if(i==index){
                arr[i-1]= newElement;
                inserted[i]=arr[i-1];
            }
            if(i>index){
                inserted[i]=arr[i-1];
            }

        }
        return inserted;
    }
}
