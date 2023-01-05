package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {
        String[][] groups= {{"John", "James", "Akos"}, {"Nati", "Adri", "Heni"}, {"Cici" , "Mici"}};
        System.out.println(Arrays.deepToString(groups));
        System.out.println(groups[1][0]);
    }
}
