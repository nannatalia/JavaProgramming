package day44_Abstraction.Practice.DeviceTask;

public class Laptop extends Computer{
    public Laptop(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
