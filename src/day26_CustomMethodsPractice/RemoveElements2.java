package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {
    public static void main(String[] args) {

    }
    public static int[] RemoveElement2(int[] arr, int index){
        if (index < 0 || index > arr.length - 1) {
            System.err.println("Invalid index nr: " + index);
            System.exit(0);
        }
        int[] result = {};
        for (int i = 0; i < arr.length; i++) {
            if(i!=index){
                result = ArraysUtility.addElement(result,i);
            }
        }
        return result;
    }
}
