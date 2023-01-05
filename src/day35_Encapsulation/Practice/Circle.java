package day35_Encapsulation.Practice;

public class Circle {
    /*
    2. Create a class named Circle

			privtae variables:
				radius
			public variable:
				pi
		 	Encapsulate all the private fields
		 			1. radius of the circle can not be zero or negative
 			Add a constructor that can set the raidus of coircle when circle object is created
 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
     */
    private int radius;
    public static double pi = 3.14;

    public Circle(int radius){
        setRadius(radius);
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        if(radius<=0){
            System.err.println("Invalid radius");
            return;
        }
        this.radius = radius;
    }
    public void calcArea(){
        System.out.println((radius * radius) * pi);
    }
    public void calcPerimeter(){
        System.out.println((2*pi*radius));
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
