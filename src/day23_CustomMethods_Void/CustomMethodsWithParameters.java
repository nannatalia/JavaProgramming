package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        OddOrEven(100);
        age(2003);
        numbers(2,7);
    }
    public static void OddOrEven(int nr){
        if(nr%2==0) {
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
    public static void age(int year){
        int ages = 2022-year;
        System.out.println("Your age is: " +ages);
    }
    public static void numbers(int x, int y){
        for (int i = x; i <= y ; i++) {
            System.out.print(i+" ");
        }
    }
}
