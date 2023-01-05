package day25_CustomMethod_Overloading;

public class Sums {
    public static void main(String[] args) {
        /*
        Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

         */
        int res = sumOfTwoNumbers(12,34);
        System.out.println(res);
        int res2 = sumOfThreeNumbers(12,34,56);
        System.out.println(res2);
        int res3 = sumOfFourNumbers(12,34,56,78);
        System.out.println(res3);
    }
    public static int sumOfTwoNumbers(int a, int b){
       return a+b;
    }
    public static int sumOfThreeNumbers(int a, int b, int c){
       return a+b+c;
    }
    public static int sumOfFourNumbers(int a, int b, int c, int d){
       return a+b+c+d;
    }

}
