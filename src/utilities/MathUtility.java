package utilities;

public class MathUtility {
    public static void main(String[] args) {

    }
    public static int sum(int n1, int n2){
        return n1+n2;
    }
    public static double sum(double n1, double n2){
        return n1+n2;
    }
    public static int substraction(int n1, int n2){ return n1-n2;}
    public static double substraction(double n1, double n2){ return n1-n2;}
    public static int multiplication(int n1, int n2){ return n1*n2;}
    public static double multiplication(double n1, double n2){ return n1*n2;}
    public static int division(int n1, int n2){ return n1/n2;}
    public static double division(double n1, double n2){ return n1/n2;}
    public static int max(int n1, int n2){
        int max = 0;
        if(n1>n2){
            max = n1;
        }else {
            max = n2;
        }
        return max;
    }
    public static double max(double n1, double n2){
        double max = 0;
        if(n1>n2){
            max = n1;
        }else {
            max = n2;
        }
        return max;
    }
    public static int min(int n1, int n2){
        int min = 0;
        if(n1<n2){
            min=n1;
        }else {
            min=n2;
        }
        return min;
    }
    public static double min(double n1, double n2){
        double min = 0;
        if(n1<n2){
            min=n1;
        }else {
            min=n2;
        }
        return min;
    }
    public static String evenOrOdd(int n){
        String res = "";
        if(n%2==0){
            res= n + " is even";
        }else {
            res= n + " is odd";
        }
        return res;
    }
    public static int square(int n){ return n*n;}
    public static double square(double n){ return n*n;}
    public static int cube(int n){ return n*n*n;}
    public static double cube(double n){ return n*n*n;}

}
