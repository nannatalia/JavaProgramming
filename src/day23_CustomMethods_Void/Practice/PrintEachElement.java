package day23_CustomMethods_Void.Practice;

public class PrintEachElement {
    public static void main(String[] args) {
        arrs(new int[]{1,2,3,4});
    }
    public static void arrs(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
