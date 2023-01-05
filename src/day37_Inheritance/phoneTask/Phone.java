package day37_Inheritance.phoneTask;

public class Phone {
    public String brand, model, size, color;
    public double price;
    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phonenr){
        System.out.println("Calling " + phonenr);
    }
    public void text(long phoneNr){
        System.out.println("Texting " + phoneNr);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
