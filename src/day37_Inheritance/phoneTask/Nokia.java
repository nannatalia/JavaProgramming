package day37_Inheritance.phoneTask;

public final class Nokia extends Phone {
    public Nokia(String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }
    public void selfDefense(){
        System.out.println("You can use "+brand+" "+model+" as self defense tool");
    }

}
