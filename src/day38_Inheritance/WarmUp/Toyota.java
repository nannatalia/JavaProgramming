package day38_Inheritance.WarmUp;

public class Toyota extends Car{

    public Toyota( String model, String color, long year, double price, double miles) {
        super("Toyota", model, color, year, price, miles);
    }
    public void reliable(){
        System.out.println("This " + brand + " " + model + " is reliable");
    }
}
