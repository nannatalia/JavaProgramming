package day23_CustomMethods_Void.Practice;

public class Areas {
    public static void main(String[] args) {
        circle(8);
        square(10);
    }
    public static void circle(int radius){
        double area = radius*radius*3.14;
        System.out.println("The area is : " +area);
    }
    public static void square(int lat){
        int area = lat*lat;
        System.out.println("The area of the square is : " + area);
    }
}
