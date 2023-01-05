package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.colour = "black and white";

        System.out.println(dog1);


        Dog dog2 = new Dog();

        dog2.name = "Bordi";
        dog2.breed = "Chihuahua";
        dog2.size = "Large";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.colour = "Brown";

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard", 2, 'M',
                "Large", "Black");

        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("-----------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));
        femaleDogs.removeIf( p -> p.gender=='M');
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));
        maleDogs.removeIf( p -> p.gender=='F');
        System.out.println("There are " + femaleDogs.size() + " female dogs");
        System.out.println("There are " + maleDogs.size() + " male dogs");
    }
}
