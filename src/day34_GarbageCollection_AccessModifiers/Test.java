package day34_GarbageCollection_AccessModifiers;

import static utilities.MathUtility.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("-------------------------------");

        int res = sum(10,20);
        System.out.println(res);

        int r2 = sum(100, 200);


        int r3 = substraction(100,50);

        int r4 = max(1000, 2000);



    }
}
