package day23_CustomMethods_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {
        hello();
        System.out.println("--------------------------------------");
        evenNumbers();
    }
    public static void hello(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
            System.out.println("Hello");  System.out.println();
        }

    }
    public static void evenNumbers(){
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

}
