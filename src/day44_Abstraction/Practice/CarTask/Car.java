package day44_Abstraction.Practice.CarTask;

public abstract class Car {
    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String make, String model, int year, double price, String color) {
        if(make.isEmpty() || make.isBlank()){
            throw new RuntimeException("Invalid make: " + make);
        }
        this.make = make;
        if(model.isEmpty() || model.isBlank()){
            throw new RuntimeException("Invalid model: " + model);
        }
        this.model = model;
        if(year<1886){
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){
            throw new RuntimeException("Invalid color: " + color);
        }
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }
    public abstract void start();
    public abstract void drive();
    public void stop(){
        System.out.println(model + " is stopping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
