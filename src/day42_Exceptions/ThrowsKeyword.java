package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("---------------------Test 1---------------------\n");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("----------------Test 1 Completed----------------\n");

        System.out.println("---------------------Test 2---------------------\n");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("----------------Test 2 Completed----------------\n");
    }
}
