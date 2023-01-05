package day12_Scanner;

//import java.util.*;  wild import, imports every class of util
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7");

        int n = input.nextInt();

        String r = "";

        if(n>=1 && n<=7){
            switch(n){
                case 1:
                    r = "Monday";
                    break;
                case 2:
                    r = "Tuesday";
                    break;
                case 3:
                    r = "Wednesday";
                    break;
                case 4:
                    r = "Thursday";
                    break;
                case 5:
                    r = "Friday";
                    break;
                case 6:
                    r = "Saturday";
                    break;
                default:
                    r = "Sunday";


            }


        }else {
            r = "Invalid Number";
        }
        System.out.println(r);
        input.close();
    }
}
