package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1= +25; //+ optional
        int num2= -25;

        System.out.println( num1 < 0); //false
        System.out.println( num2 < 0); //true

        System.out.println("------------------------------");

        int a = 5;
        ++a; //pre increment/ increase the value by 1

        System.out.println(a);

        --a; //pre decrement/ decrease the value by 1

        System.out.println(a);

        System.out.println("-------------------------------------");

        int b= 100;

        // b++; post increment

        System.out.println(b++); // passes the current value then increase it with 1
        System.out.println(b);

        System.out.println("---------------------------------------");

        int x = 200;

        System.out.println(--x); //decreases the value by 1/ predecrement

        int y = 200;

        System.out.println(y--); //
        System.out.println(y);

        System.out.println("-----------------------------------------");

        int z = 45;

        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        int q =30;
        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);

        System.out.println("---------------------------------------");








    }
}
