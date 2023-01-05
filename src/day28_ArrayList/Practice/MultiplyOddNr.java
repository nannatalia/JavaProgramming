package day28_ArrayList.Practice;

import java.util.ArrayList;

public class MultiplyOddNr {
    public static void main(String[] args) {
        /*
        3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i+=2) {
            list.set(i, list.get(i)*2);
        }
        System.out.println(list);
    }
}
