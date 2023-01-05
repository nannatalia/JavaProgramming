package day44_Abstraction.Practice.CarTask;

import day44_Abstraction.Practice.CarTask.Car;

public class Toyota extends Car {
    public Toyota(String make, String model, int year, double price, String color) {
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
