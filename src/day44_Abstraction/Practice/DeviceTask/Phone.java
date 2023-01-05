package day44_Abstraction.Practice.DeviceTask;

public abstract class Phone extends Device{
    public Phone(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
    public void call(long phoneNr){
        System.out.println("I'm calling " + phoneNr);
    }
    public void text(long phoneNr){
        System.out.println("I'm texting " + phoneNr);
    }


}
