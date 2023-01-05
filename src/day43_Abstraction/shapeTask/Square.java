package day43_Abstraction.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
        if(side<0){
            throw new RuntimeException("Invalid side: " + side);
        }
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void area() {
        System.out.println(side * side);
    }

    @Override
    public void perimeter() {
        System.out.println(4 * side);
    }
}
