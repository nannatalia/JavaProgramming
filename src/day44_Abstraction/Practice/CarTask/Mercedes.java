package day44_Abstraction.Practice.CarTask;

import day44_Abstraction.Practice.CarTask.AutoPark;
import day44_Abstraction.Practice.CarTask.Car;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " is autoparking");
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
