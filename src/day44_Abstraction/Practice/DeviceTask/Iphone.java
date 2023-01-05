package day44_Abstraction.Practice.DeviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{
    public Iphone(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

    }
}
