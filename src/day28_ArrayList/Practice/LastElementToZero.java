package day28_ArrayList.Practice;

import java.util.ArrayList;

public class LastElementToZero {
    public static void main(String[] args) {
        /*
        1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(list.size()-1, 0);
        System.out.println(list);
    }
}
