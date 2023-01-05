package day33_Statics.Practice;

public class Circle {
    public int radius;
    public static double pi = 3.14;
    int diameter = radius*2;

    public Circle(int radius, int diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
    public void calcArea(){
        System.out.println(radius*radius*pi);
    }
    public void calcPerimeter(){
        System.out.println(diameter*pi);
    }
    public static void printPI(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter + "pi= " + pi + ", area= " + (radius*radius*pi) + ", perimeter= " + (diameter*pi) +
                '}';
    }
}
