package day06_PrimitiveTypeCastings;

public class BirthDay {

    public static void main(String[] args) {

        /* 1. Create a class named BirthDay and create the following variable
 name, birthDay(int), birthMonth(String),
birthYear(int)
 use concatenation to display the birthday of the person
 if  name = "John"
 birthDay = 25
     birthMonth = "April"
     birthYear = 1995;
 output:
 John was born on April/25/1995. */
    String name = "Natalia";
    int birthDay = 16;
    String birthMonth = "August";
    int birthYear = 2003;

        System.out.println(name + " " + "was born on " + birthMonth + "/" + birthDay + "/" + birthYear
        + ".");

        System.out.println("---------------------------------------");

        String bookName = "Harry Potter";

        System.out.println("My favorite book is \"" + bookName + "\"" + ".");


    }

}
