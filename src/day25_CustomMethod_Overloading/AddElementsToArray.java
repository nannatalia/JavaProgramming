package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        /*
        Task2:
		1. create a return method called addInteger that can add an Inteeger
		after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add
	    a double after the last index of a double array

	    3. create a return method called addString that can add a String
	    after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of
	    a char array
         */
        int[] res = addInteger(new int[]{1,2,3,4}, 5);
        System.out.println(Arrays.toString(res));
        double[] res2 = addDouble(new double[] { 1,23,4.3}, 2.1);
        System.out.println(Arrays.toString(res2));
        String[] res3 = addString(new String[]{"baba", "tata", "cica"}, "Nati");
        System.out.println(Arrays.toString(res3));
        char[] res4 = addChar(new char[]{'a', 'b','c'}, 'd');
        System.out.println(Arrays.toString(res4));
    }
    public static int[] addInteger(int[] arr1, int a){
        int[] newArray = new int[arr1.length+1];
        for (int i = 0, j =0; i < arr1.length; i++, j ++) {
            newArray[j]=arr1[i];
                newArray[newArray.length-1]=a;
            }return newArray;
        }
        public static double[] addDouble(double[] arr2, double b){
        double[] newArray2 = new double[arr2.length+1];
            for (int i = 0, j = 0; i < arr2.length; i++, j++) {
                newArray2[j] = arr2[i];
                newArray2[newArray2.length-1]=b;
            }
            return newArray2;
        }
        public static String[] addString(String[] arr3, String c){
        String[] newArray3 = new String[arr3.length+1];
        int i = 0;
            for (String s : arr3) {
                newArray3[i++]=s;
            }
            newArray3[newArray3.length-1] = c;
            return newArray3;
        }
        public static char[] addChar(char[] arr4, char d){
        char[] newArray4 = new char[arr4.length+1];
        int i=0;
            for (char c : arr4) {
                newArray4[i++]=c;
            }
            newArray4[i]=d;
            return newArray4;
        }
    }
