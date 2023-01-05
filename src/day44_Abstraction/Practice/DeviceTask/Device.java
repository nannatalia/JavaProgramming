package day44_Abstraction.Practice.DeviceTask;

public abstract class Device {
    private final String brand, model;
    private double price;
    private String color;
    private final double size;
    private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, String color, double size, boolean hasBattery, boolean hasPowerButton) {
       if(brand.isEmpty() || brand.isBlank()){
           throw new RuntimeException("Invalid brand: " + brand);
       }
        this.brand = brand;
        if(model.isEmpty() || model.isBlank()){
            throw new RuntimeException("Invalid model: " + model);
        }
        this.model = model;
        setPrice(price);
        setColor(color);
        if(size<=0 || size>=10){
            throw new RuntimeException("Invalid size: " + size);
        }
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if(price<=0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){
            throw new RuntimeException("Invalid color: " + color);
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    public abstract void turnOn();
    public abstract void turnOff();


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
