package day39_Recap.shapeTask;

public class Square extends Shape{

    private double side;

    public Square(String name) {
        super(name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.out.println("Invalid side: " + side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");
        this.side = side;
    }
    public double area(){
        return side*side;
    }


    public double perimeter() {
        return 4*side;
    }
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

}
