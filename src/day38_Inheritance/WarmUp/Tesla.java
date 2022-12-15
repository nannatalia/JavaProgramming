package day38_Inheritance.WarmUp;

public class Tesla extends Car{

    public Tesla( String model, String color, long year, double price, double miles) {
        super("Tesla", model, color, year, price, miles);
    }
    public void autopilot(){
        System.out.println("This " + model + " can autopilot");
    }
}
