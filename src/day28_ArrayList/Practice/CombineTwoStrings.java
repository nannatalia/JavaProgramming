package day28_ArrayList.Practice;

import java.util.ArrayList;

public class CombineTwoStrings {
    public static void main(String[] args) {
        /*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */
        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr1) {
            list.add(s);
        }
        for (String s : arr2) {
            list.add(s);
        }
        System.out.println(list);
    }
}
