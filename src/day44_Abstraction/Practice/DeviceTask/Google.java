package day44_Abstraction.Practice.DeviceTask;

public class Google extends Phone implements Downloadable, AndroidApps{
    public Google(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void downloadApp() {

    }
}
