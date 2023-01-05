package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer> unique1 = new ArrayList<>();

        for (Integer integer : list1) {
            int freq = Collections.frequency(list1,integer);
            if(freq==1)
                unique1.add(integer);
        }
        System.out.println(unique1);

        System.out.println("------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9));
        ArrayList<Integer> unique2 = new ArrayList<>(list2);

        unique2.removeIf(p -> Collections.frequency(list2, p)>1);
        System.out.println(unique2);
    }
}
