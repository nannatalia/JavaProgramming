package day49_Collections;

import java.util.*;

public class SetInterfacePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("list = " + list);
        System.out.println( list.get(4) );

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,20,30,40,50));
        hashSet.addAll(Arrays.asList(10,20,30,40,50));
        hashSet.addAll(Arrays.asList(10,20,30,40,50));
        hashSet.addAll(Arrays.asList(10,20,30,40,50));
        hashSet.addAll(Arrays.asList(null,null,null));

        System.out.println("hashSet = " + hashSet);
        //System.out.println(hashSet.get(4));


        Set<Integer> linkedHashList = new LinkedHashSet<>();
        linkedHashList.addAll(Arrays.asList(30,20,10,50,40));
        linkedHashList.addAll(Arrays.asList(50,20,10,40,30));
        linkedHashList.addAll(Arrays.asList(30,20,10,40,50));
        linkedHashList.addAll(Arrays.asList(10,20,30,40,50));
        linkedHashList.addAll(Arrays.asList(null,null,null));

        System.out.println("linkedHashList = " + linkedHashList);


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(10,20,30,40,50));
        treeSet.addAll(Arrays.asList(10,20,30,40,50));
        treeSet.addAll(Arrays.asList(10,20,30,40,50));
        treeSet.addAll(Arrays.asList(10,20,30,40,50));
        //treeSet.addAll(Arrays.asList(null,null,null));

        System.out.println("treeSet = " + treeSet);

        //   String str = null;
        // System.out.println(str.charAt(0));



    }
}
