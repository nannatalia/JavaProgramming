package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] nr = {1,2,3,4,5};
        nr = addElement(nr, 6);
        System.out.println(Arrays.toString(nr));
        char[] chars = {'A','B','C','D'};
        chars = addElement(chars, 'E');
        System.out.println(Arrays.toString(chars));
        String[] names = {"Akica", "Natica", "Milica"};
        names = addElement(names, "Armica");
        System.out.println(Arrays.toString(names));

    }
    public static int[] addElement(int[] arr1, int a){
        int[] newArray = new int[arr1.length+1];
        for (int i = 0, j =0; i < arr1.length; i++, j ++) {
            newArray[j]=arr1[i];
            newArray[newArray.length-1]=a;
        }return newArray;
    }
    public static double[] addElement(double[] arr2, double b){
        double[] newArray2 = new double[arr2.length+1];
        for (int i = 0, j = 0; i < arr2.length; i++, j++) {
            newArray2[j] = arr2[i];
            newArray2[newArray2.length-1]=b;
        }
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
}
