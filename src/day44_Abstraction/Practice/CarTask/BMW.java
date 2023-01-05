package day44_Abstraction.Practice.CarTask;

public class BMW extends Car {
    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getModel() + " is being driven");

    }
}
