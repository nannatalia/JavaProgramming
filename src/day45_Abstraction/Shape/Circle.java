package day45_Abstraction.Shape;

public class Circle extends Shape{
    private double radius;
    public final static double pi = 3.14;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw new RuntimeException("Invalid Radius: "+radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString()+
                "radius=" + radius + ", area=" + area() + ", perimeter=" + perimeter()+
                '}';
    }
}
