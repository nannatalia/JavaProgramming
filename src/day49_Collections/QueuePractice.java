package day49_Collections;

import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> priorityQ = new PriorityQueue<>();
        priorityQ.addAll(Arrays.asList(10,20,300,40,500));

        System.out.println("priorityQ = " + priorityQ);

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("arrayDeque = " + arrayDeque);

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("linkedList = " + linkedList);

        System.out.println("-------------------------------------------------");

        priorityQ.poll();

        System.out.println("priorityQueue = " + priorityQ);

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);

        System.out.println("-------------------------------------------------");

        // System.out.println(priorityQueue.get(1));
        //  System.out.println(arrayDeque.get(1));

        //   System.out.println( ( (List)linkedList ).get(1) );

        System.out.println(((LinkedList<Integer>) linkedList).get(1));

    }
}
