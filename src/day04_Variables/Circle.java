package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        /* 3. Create a class named Circle, write a program that can calculate
the area & perimeter of any given Circle. PI, radius, diameter, area, perimeter
Hints: PI = 3.14
area = radius * radius * PI
Perimeter = 2 * radius * PI */
    double PI = 3.14;
    int radius = 6;

    int diameter = 2 * radius;
    double area = radius * radius * PI;
    double perimeter = 2 * radius * PI;

        System.out.println("diameter = " + diameter);
        System.out.println("radius = " + radius);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);




    }
}
