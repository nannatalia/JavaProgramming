package day38_Inheritance.WarmUp;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Gray", 2020, 20000, 123456);


        Tesla tesla = new Tesla("Model S","Red" , 2022, 94990, 0);

        BMW bmw = new BMW("X5", "black", 2020, 67350, 12000);

    //nati

        toyota.start();
        tesla.start();
        bmw.start();


    }
}
