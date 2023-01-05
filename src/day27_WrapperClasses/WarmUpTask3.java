package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask3 {
    public static void main(String[] args) {
        int[] res = removeDuplicates(new int[]{1,1,2,3,3,4,5,66,66,66});
        System.out.println(Arrays.toString(res));
    }
    public static int[] removeDuplicates(int[] arr){
        int[] res={};
        for (int i : arr) {
            if(!ArraysUtility.contains(res,i)){
                res= ArraysUtility.addElement(res,i);
            }
        }
        return res;
    }
}
