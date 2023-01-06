package day45_Abstraction.Shape;

public class Cube extends Shape implements Volume{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    @Override
    public double area() {
        return 6*side*side;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return side*side*side;
    }
}
