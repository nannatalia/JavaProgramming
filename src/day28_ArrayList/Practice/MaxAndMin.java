package day28_ArrayList.Practice;

import java.util.ArrayList;

public class MaxAndMin {
    public static void main(String[] args) {
        /*
        5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5

        6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer max = list.get(0);
        for (Integer integer : list) {
            if(integer>max)
                max = integer;
        }
        System.out.println(max);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        Integer min = list2.get(0);
        for (Integer integer : list2) {
            if(integer<min)
                min=integer;
        }
        System.out.println(min);
    }
}
