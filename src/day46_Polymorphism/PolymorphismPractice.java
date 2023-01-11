package day46_Polymorphism;

import day38_Inheritance.warmUp.*;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Car[] cars = {
                new Toyota("Highlander", "White", 2010, 25000, 255000),
                new BMW("X5", "Red", 2014, 32000, 12000),
                new Toyota("Corolla", "White", 2011, 20000, 310000),
                new BMW("M3", "Blue", 2015, 33000, 14030),
                new BMW("M5", "Black", 2017, 35000, 15000),
                new BMW("M4", "White", 2018, 40000, 19000),
                new BMW("7 Series", "Purple", 2009, 30000, 21000),
                new BMW("i3", "Black", 2011, 30000, 9000),
                new Toyota("Camry", "Red", 2018, 30000, 185000),
                new Toyota("Rav4", "Red", 2012, 23000, 285000),
                new Toyota("Avalon", "Blue", 2019, 3500, 175230),
                new Tesla("Model 3", "White", 2015, 45000, 235000),
                new Tesla("Model Y", "Black", 2017, 65000, 135000),
                new Tesla("Model X", "White", 2016, 48000, 235000),
                new Tesla("Model X", "White", 2014, 48000, 236000)};

        Car carWithHighestMileage = cars[0],
                carWithLowestMileage = cars[0];
        for (Car car : cars) {
            if (car instanceof Toyota) {
                if (car.year >= 2010 && car.year <= 2011) {
                    System.out.println(car);
                }
            }
            if (car instanceof BMW) {
                if (car.year >= 1929 && car.year <= 2022) {
                    System.out.println(car);
                }
            }
            if (car instanceof Tesla) {
                if (car.year >= 2015 && car.year <= 2016) {
                    System.out.println(car);
                }
            }
            if (carWithHighestMileage.miles < car.miles) {
                carWithHighestMileage = car;
            }
            if (carWithLowestMileage.miles > car.miles) {
                carWithLowestMileage = car;
            }
        }
        System.out.println(carWithHighestMileage);
        System.out.println(carWithLowestMileage);

    }
}