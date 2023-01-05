package day28_ArrayList.Practice;

import java.util.ArrayList;

public class FirstDuplicatedElement {
    public static void main(String[] args) {
        /*
        7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);
        Integer n = 0;
        for(int i=0; i<list.size();i++) {
            if(list.indexOf(list.get(i))!=list.lastIndexOf(list.get(i))){
                n= list.get(i);
                break;
            }
        }
        System.out.println(n);
    }
}
