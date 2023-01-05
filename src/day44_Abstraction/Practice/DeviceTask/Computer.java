package day44_Abstraction.Practice.DeviceTask;

public abstract class Computer extends Device{
    public Computer(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
}
