package day35_Encapsulation.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Cioco", 3, 1.3 , true);
        Candy candy2 = new Candy("Rolls", 8, 2.1, false);
        Candy candy3 = new Candy("Maltesers", 20, 5.4, false);

        Candy[] array = {candy1,candy2,candy3};

        ArrayList<Candy> list = new ArrayList<>(Arrays.asList(array));
        for (Candy candy : list) {
            System.out.println(candy.getBrand());
        }

    }
}
