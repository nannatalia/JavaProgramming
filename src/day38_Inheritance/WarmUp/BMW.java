package day38_Inheritance.warmUp;

public class BMW extends Car{
    public BMW(String model, String color, long year, double price, double miles) {
        super("BMW", model, color, year, price, miles);
    }
    public void breaksdown(){
        System.out.println("This " + model + " breaks down");
    }
    public void racing(){
        System.out.println("This " + model + " is good for racing");
    }
}
