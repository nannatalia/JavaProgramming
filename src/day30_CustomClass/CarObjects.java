package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setInfo("Mercedes", "S Class", "Red", 2022, 21232);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Dacia", "Sanderro", "Black", 2015, 5000);

        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "A6", "Grey", 2008, 5667);

        System.out.println(car3);

        ArrayList<Car> carList = new ArrayList<>(Arrays.asList(car1,car2,car3));
        for (Car car : carList) {
            System.out.println(car.brand + " $" + car.price);
        }
        System.out.println("-----------------------------------------------------");

        carList.removeIf( p -> p.brand.equals("Dacia") && p.year<=2016);
        System.out.println(carList);
    }
}
