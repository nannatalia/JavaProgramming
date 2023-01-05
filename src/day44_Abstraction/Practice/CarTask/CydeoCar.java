package day44_Abstraction.Practice.CarTask;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {
    public CydeoCar(String make, String model, int year, double price, String color) {
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

    @Override
    public void Fly() {
        System.out.println(getModel() + " is flying");
    }
}