package day44_Abstraction.Animal;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, String color, char gender, char size) {
        super(name, breed, color, gender, size);
    }

    public void meow(){
        System.out.println(getName() + " is Meowing");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Biryani");
    }

    @Override
    public void Play() {

    }
}
