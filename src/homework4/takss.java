package homework4;

import java.util.Arrays;

public class takss {
    public static void main(String[] args) {
        /*
        10. create a method named removeElement
        that passes one integer array and one integer,
         the method removes the integer index from
          the integer array and returns the new array
			Ex:
				array = {10, 20, 30, 40, 50, 60}
				index = 2


				removeElement(array, index) ==== {10, 20, 40, 50, 60}
         */
        int[] result = removeElement(new int[]{10,20,30,40,50,60}, 2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] removeElement(int[] array, int index){
        int[] removedArray = new int[array.length-1];
        int j =0;
        for (int i = 0; i < array.length ; i++) {
            if(i==index){
                continue;
            }
            removedArray[j++]=array[i];
        } return removedArray;
    }
}
