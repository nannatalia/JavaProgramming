package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Gunay";
        names[1] = "Neira";
        names[2] = "Suat";
        names[3] = "Hulya";
        names[4] = "Mikael";
        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------");
        Scanner input = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter a number:");
        int nr = input.nextInt();
        if(nr<1 || nr>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[nr-1]);
        System.out.println("-----------------------------------------");
        String[] months = {"January","February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("-----------------------------------------");
        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);
        }
    }
}
