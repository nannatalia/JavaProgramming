package utilities;

import java.util.Arrays;

public class ArraysUtility {

    // print each element from the array
    public static void PrintEach(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void PrintEach(double[] arr){
        for (double i : arr) {
            System.out.println(i);
        }
    }
    public static void PrintEach(char[] arr){
        for (char i : arr) {
            System.out.println(i);
        }
    }
    public static void PrintEach(String[] arr){
        for (String i : arr) {
            System.out.println(i);
        }
    }

    // find the maximum from the array

    public static int max(int[] arr){
        int max= arr[0];
        for (int i : arr) {
            if(i>max)
                max=i;
        } return max;
    }
    public static double max(double[] arr){
     Arrays.sort(arr);
     return arr[arr.length-1];
    }

    // find out if the array contains a specific element

    public static boolean contains(int[] arr, int a){
        boolean res=false;
        for (int i : arr) {
           res= (i==a)? true : false;
        }
        return res;
    }
    public static boolean contains(double[] arr, double a){
        boolean res=false;
        for (double i : arr) {
           res= (i==a)? true : false;
        }
        return res;
    }
    public static boolean contains(char[] arr, char a){
        boolean res=false;
        for (char i : arr) {
           res= (i==a)? true : false;
        }
        return res;
    }
    public static boolean contains(String[] arr, String a){
        boolean res=false;
        for (String i : arr) {
           res= (i.equals(a))? true : false;
        }
        return res;
    }

    //  merge 2 arrays

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] merge2arrays = new int[arr1.length+ arr2.length];
        int j = 0;
        for (int i : arr1) {
            merge2arrays[j++]=i;
        }
        for (int i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }
    public static double[] mergeArrays(double[] arr1, double[] arr2){
        double[] merge2arrays = new double[arr1.length+ arr2.length];
        int j = 0;
        for (double i : arr1) {
            merge2arrays[j++]=i;
        }
        for (double i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }
    public static char[] mergeArrays(char[] arr1, char[] arr2){
        char[] merge2arrays = new char[arr1.length+ arr2.length];
        int j = 0;
        for (char i : arr1) {
            merge2arrays[j++]=i;
        }
        for (char i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }
    public static String[] mergeArrays(String[] arr1, String[] arr2){
        String[] merge2arrays = new String[arr1.length+ arr2.length];
        int j = 0;
        for (String i : arr1) {
            merge2arrays[j++]=i;
        }
        for (String i1 : arr2) {
            merge2arrays[j++]=i1;
        }
        return merge2arrays;
    }

    // add an element to an array

    public static int[] addElement(int[] arr1, int a){
        int[] newArray = new int[arr1.length+1];
        int i = 0;

        for (int each : arr1) {
            newArray[i++]=each;
        }
        newArray[i]=a;
        return newArray;
    }
    public static double[] addElement(double[] arr2, double b){
        double[] newArray2 = new double[arr2.length+1];
        int i = 0;
        for (double v : arr2) {
            newArray2[i++]=v;
        }
        newArray2[i]=b;
        return newArray2;
    }
    public static String[] addElement(String[] arr3, String c){
        String[] newArray3 = new String[arr3.length+1];
        int i = 0;
        for (String s : arr3) {
            newArray3[i++]=s;
        }
        newArray3[newArray3.length-1] = c;
        return newArray3;
    }
    public static char[] addElement(char[] arr4, char d){
        char[] newArray4 = new char[arr4.length+1];
        int i=0;
        for (char c : arr4) {
            newArray4[i++]=c;
        }
        newArray4[i]=d;
        return newArray4;
    }

    // reverse an array

    public static int[] Reverse(int[] arr){
        int[] reversed = new int[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++]=arr[i];
        }
        return reversed;
    }
    public static double[] Reverse(double[] arr){
        double[] reversed = new double[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++]=arr[i];
        }
        return reversed;
    }
    public static char[] Reverse(char[] arr){
        char[] reversed = new char[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++]=arr[i];
        }
        return reversed;
    }
    public static String[] Reverse(String[] arr){
        String[] reversed = new String[arr.length];
        int j =0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j++]=arr[i];
        }
        return reversed;
    }

    // count the frequency of an element

    public static int FrequencyOfAnElement(int[] arr, int a){
        int count =0;
        for (int i : arr) {
            if(i==a){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfAnElement(double[] arr, double a){
        int count =0;
        for (double i : arr) {
            if(i==a){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfAnElement(char[] arr, char a){
        int count =0;
        for (char i : arr) {
            if(i==a){
                count++;
            }
        }
        return count;
    }
    public static int FrequencyOfAnElement(String[] arr, String a){
        int count =0;
        for (String i : arr) {
            if(i.equals(a)){
                count++;
            }
        }
        return count;
    }

    // find the unique elements from an array

    public static int[] CountUniqueElements(int[] arr){
        int[] result = {};
        for (int i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
                result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }
    public static double[] CountUniqueElements(double[] arr){
        double[] result = {};
        for (double i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
                result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }
    public static char[] CountUniqueElements(char[] arr){
        char[] result = {};
        for (char i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
                result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }
    public static String[] CountUniqueElements(String[] arr){
        String[] result = {};
        for (String i : arr) {
            if(ArraysUtility.FrequencyOfAnElement(arr, i)==1){
                result = ArraysUtility.addElement(result,i);
            }
        } return result;
    }

    // remove element from an array

    public static int[] RemoveElement(int[] arr, int index){
        int[] arr2 = new int[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
    public static double[] RemoveElement(double[] arr, int index){
        double[] arr2 = new double[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
    public static char[] RemoveElement(char[] arr, int index){
        char[] arr2 = new char[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
    public static String[] RemoveElement(String[] arr, int index){
        String[] arr2 = new String[arr.length-1];
        int j =0;
        for (int i = 0; i < arr.length; i++) {
            if(i==index){
                continue;
            }
            arr2[j++] = arr[i];
        }
        return arr2;
    }
    // replace one element

    public static int[] replace(int[] arr, int index, int newElement){
        if (index<0 || index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        arr[index]=newElement;

        return arr;
    }
    public static double[] replace(double[] arr, int index, double newElement){
        if (index<0 || index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        arr[index]=newElement;

        return arr;
    }
    public static char[] replace(char[] arr, int index, char newElement){
        if (index<0 || index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        arr[index]=newElement;

        return arr;
    }
    public static String[] replace(String[] arr, int index, String newElement){
        if (index<0 || index>arr.length-1){
            System.err.println("Invalid index");
            System.exit(0);
        }
        arr[index]=newElement;

        return arr;
    }

    // replace all elements

    public static int[] replaceAll(int[] arr, int oldElement, int newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==oldElement){
                arr[i]=newElement;
            }
        }

        return arr;
    }
    public static double[] replaceAll(double[] arr, double oldElement, double newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==oldElement){
                arr[i]=newElement;
            }
        }

        return arr;
    }
    public static char[] replaceAll(char[] arr, char oldElement, char newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==oldElement){
                arr[i]=newElement;
            }
        }

        return arr;
    }
    public static String[] replaceAll(String[] arr, String oldElement, String newElement){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase(oldElement)){
                arr[i]=newElement;
            }
        }

        return arr;
    }

    // remove duplicates

    public static int[] removeDuplicates(int[] arr){
        int[] res={};
        for (int i : arr) {
            if(!ArraysUtility.contains(res,i)){
                res= ArraysUtility.addElement(res,i);
            }
        }
        return res;
    }
    public static double[] removeDuplicates(double[] arr){
        double[] res={};
        for (double i : arr) {
            if(!ArraysUtility.contains(res,i)){
                res= ArraysUtility.addElement(res,i);
            }
        }
        return res;
    }
    public static char[] removeDuplicates(char[] arr){
        char[] res={};
        for (char i : arr) {
            if(!ArraysUtility.contains(res,i)){
                res= ArraysUtility.addElement(res,i);
            }
        }
        return res;
    }
    public static String[] removeDuplicates(String[] arr){
        String[] res={};
        for (String i : arr) {
            if(!ArraysUtility.contains(res,i)){
                res= ArraysUtility.addElement(res,i);
            }
        }
        return res;
    }

    // swap elements

    public static int[] swap(int[] arr, int i , int j){
        int nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }
    public static double[] swap(double[] arr, int i , int j){
        double nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }
    public static char[] swap(char[] arr, int i , int j){
        char nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }
    public static String[] swap(String[] arr, int i , int j){
        String nr = arr[i];
        for (int i1 = 0; i1 < arr.length; i1++) {
            if(i1==i)
                arr = ArraysUtility.replace(arr, i1, arr[j]);

            if(i1==j)
                arr = ArraysUtility.replace(arr, i1, nr);
        }
        return arr;
    }

    // insert elements

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
    public static double[] insert(double[] arr, int index, double newElement){
        double[] inserted = new double[arr.length+1];
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
    public static char[] insert(char[] arr, int index, char newElement){
        char[] inserted = new char[arr.length+1];
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
    public static String[] insert(String[] arr, int index, String newElement){
        String[] inserted = new String[arr.length+1];
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

