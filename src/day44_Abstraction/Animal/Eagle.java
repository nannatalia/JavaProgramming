package day44_Abstraction.Animal;

public class Eagle extends Animal implements WildAnimal, Flyable{
    public Eagle(String name, String breed, String color, char gender, char size) {
        super(name, breed, color, gender, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating snake");
    }

    @Override
    public void Fly() {
        System.out.println(getName()+" can fly 50km/h");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts snake");
    }
}
