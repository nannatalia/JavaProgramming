package day44_Abstraction.Practice.CarTask;

import day44_Abstraction.Practice.CarTask.AutoPark;
import day44_Abstraction.Practice.CarTask.AutoPilot;
import day44_Abstraction.Practice.CarTask.Car;

public class Nio extends Car implements AutoPark, AutoPilot {
    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getModel() + " is autoparking");
    }

    @Override
    public void selfDrive() {
        System.out.println(getModel() + " is self driving");
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
