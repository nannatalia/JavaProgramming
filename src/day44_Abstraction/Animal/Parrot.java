package day44_Abstraction.Animal;

public class Parrot extends Animal implements Flyable, Playable{
    public Parrot(String name, String breed, String color, char gender, char size) {
        super(name, breed, color, gender, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");
    }


    @Override
    public void Fly() {
        System.out.println(getName() + " can fly 20km/h");
    }

    @Override
    public void Play() {

    }
}
