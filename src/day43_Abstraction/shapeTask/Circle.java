package day43_Abstraction.shapeTask;

public class Circle extends Shape{

    private double radius;
    private static double pi = 3.14;
    public Circle(double radius) {
        super("Circle");
        if(radius<=0){
            throw new RuntimeException("Invalid radius: "+ radius);
        }
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    @Override
    public void area() {
        System.out.println(radius*radius*pi);
    }

    @Override
    public void perimeter() {
        System.out.println(2*pi*radius);
    }


}
