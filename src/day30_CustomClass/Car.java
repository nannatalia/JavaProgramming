package day30_CustomClass;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, int carPrice){
        brand=carBrand; // we declare as instance to have different copies
        model=carModel;
        color=carColor;
        year=carYear;
        price=carPrice;
    }
    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }
    public void start(){
        System.out.println(brand+" "+model+" has started");
    }
    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
