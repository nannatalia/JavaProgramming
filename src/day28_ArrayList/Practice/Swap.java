package day28_ArrayList.Practice;

import java.util.ArrayList;

public class Swap {
    public static void main(String[] args) {
        /*
        2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer int1 = list.get(list.size()-1);
        Integer int2 = list.get(0);
        list.set(0, int1);
        list.set(list.size()-1, int2);
        System.out.println(list);
    }
}
