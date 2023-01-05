package day23_CustomMethods_Void.Practice;

public class PosNegZero {
    public static void main(String[] args) {
        posnegzero(-9);
    }
    public static void posnegzero(int nr){
        if(nr==0){
            System.out.println(nr + " is zero");
        } else if (nr<0) {
            System.out.println(nr + " is negative");
        }else {
            System.out.println(nr + " is positive");
        }
    }
}
