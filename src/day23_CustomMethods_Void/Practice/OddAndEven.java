package day23_CustomMethods_Void.Practice;

public class OddAndEven {
    public static void main(String[] args) {
        OddNr();
        EvenNr();
    }
    public static void OddNr(){
        for (int i = 1; i < 101; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void EvenNr(){
        for (int i = 0; i < 101; i+=2) {
            System.out.print(i+" ");
        }
    }
}
