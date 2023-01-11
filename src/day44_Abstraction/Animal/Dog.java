package day44_Abstraction.Animal;

public class Dog extends Animal implements Playable{
    public Dog(String name, String breed, String color, char gender, char size) {
        super(name, breed, color, gender, size);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating pizza");
    }

    @Override
    public void Play() {
        System.out.println(getName() +" is playing with ball");
    }
}
