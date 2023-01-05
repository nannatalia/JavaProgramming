package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {
        /* 2. Create a class named Rectangle, write a program that can
        calculate the area & perimeter of any given Rectangle
        length width
area = length *  width
perimeter =  2 * (length + width) */
        int lenght = 4;
        int width = 3;

        int area = lenght * width;
        int perimeter = 2 * lenght + 2 * width;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
