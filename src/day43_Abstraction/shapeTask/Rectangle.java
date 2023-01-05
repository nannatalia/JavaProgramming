package day43_Abstraction.shapeTask;

public class Rectangle extends Shape{

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        if(width<=0 || length<=0){
            throw new RuntimeException("Invalid data");
        }
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void area() {
        System.out.println(width*length);
    }

    @Override
    public void perimeter() {
        System.out.println(2*(width+length));
    }
}
