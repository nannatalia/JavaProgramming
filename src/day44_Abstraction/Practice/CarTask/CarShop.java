package day44_Abstraction.Practice.CarTask;

public class CarShop {
    public static void main(String[] args) {

        Toyota chaser = new Toyota("chaser", "something", 2020, 85600, "black");
        BMW m5 = new BMW("British Racing Green", "M5", 2022, 132000, "green");
        Mercedes mercedes = new Mercedes("Mercedes", "S class", 2022, 165300, "White");
        Tesla tesla = new Tesla("Tesla", "Model S", 2018, 130000, "Grey");
        CydeoCar car = new CydeoCar("Cybertek", "New", 2012, 111111, "Purple");

        chaser.drive();
        m5.start();
        mercedes.autoPark();
        tesla.selfDrive();
        car.Fly();

        System.out.println(chaser);
        System.out.println(m5);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(car);
    }
}
