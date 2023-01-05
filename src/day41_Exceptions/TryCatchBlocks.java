package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {
    public static void main(String[] args) {
        System.out.println("Test started");

        try {
            System.out.println(9/0);

            System.out.println("Try Block");
        } catch (ArithmeticException e){
            System.out.println("Catch Block");

            System.out.println("Arithmetic Exception was occurred");

        }

        System.out.println("Test completed");

        System.out.println("---------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {
            System.out.println(numbers[299]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test2 completed");

        System.out.println("---------------------------------------------");

        System.out.println("Test3 started");


        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test3 completed");

        System.out.println("---------------------------------------------");

        System.out.println("Hello");


        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Cydeo");

        System.out.println("---------------------------------------------");

        try {
            FileInputStream file = new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }







    }
}
