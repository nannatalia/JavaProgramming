package day45_Abstraction.Shape;

public class Square extends Shape{
    private double side;

    public double getSide() {
        return side;
    }

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public void setSide(double side) {
        if(side<=0){
            throw new RuntimeException("Invalid side: "+ side);
        }
        this.side = side;
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString()+
                "side=" + side + ", area= " + area() + ", perimeter= " + perimeter()+
                '}';
    }
}
