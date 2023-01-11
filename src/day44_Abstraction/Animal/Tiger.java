package day44_Abstraction.Animal;

public class Tiger extends Animal implements WildAnimal{
    public Tiger(String name, String breed, String color, char gender, char size) {
        super(name, breed, color, gender, size);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts deer");
    }
}
