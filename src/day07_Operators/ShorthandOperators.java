package day07_Operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        //assignment: =

        int nr = 100;

        System.out.println(nr); //100

        nr = 200;

        System.out.println(nr);

        // the nr memorises the last value that was given

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        //Addition Assignment

        int x= 100;

        System.out.println("x = " + x);

        x+=200;

        System.out.println("x = " + x);

        String str = "Wooden";

        str+= "Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1);

        num1+= 5.5;

        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;

        availableBalance+=300;

        System.out.println("availableBalance = " + availableBalance);
    }
}
