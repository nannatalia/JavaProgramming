package day37_Inheritance.phoneTask;

public final class Samsung extends Phone{
    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }
    public void freeze() {
        System.out.println(brand + " " + model + " is freezing");
    }
}
