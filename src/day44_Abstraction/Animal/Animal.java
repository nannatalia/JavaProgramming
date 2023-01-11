package day44_Abstraction.Animal;

public abstract class Animal {
    private String name;
    private final String breed, color;
    private final char gender;
    private char size;
    public final static boolean canBreathe;

    static{
        canBreathe = true;
    }

    public Animal(String name, String breed, String color, char gender, char size) {
        setName(name);
        this.breed = breed;
        this.color = color;
        if(!(gender=='M' || gender=='F')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public char getSize() {
        return size;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Invalid Name");
        }this.name = name;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public abstract void eat();

    public void drink(){
        System.out.println(name + " is drinking water");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", size=" + size +
                '}';
    }
}
