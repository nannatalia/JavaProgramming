package day48_Collections;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4));
        System.out.println(list.get(0));
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list2.get(0));

        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list3.get(0));

        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println(list4.get(0));

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);


    }
}
