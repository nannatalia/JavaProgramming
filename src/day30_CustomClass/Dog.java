package day30_CustomClass;

public class Dog {

        public String name;
        public String breed;
        public String size;
        public int age;
        public char gender;
        public String colour;

        public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
            name = dogName;
            breed = dogBreed;
            size = dogSize;
            age = dogAge;
            gender = dogGender;
            colour = dogColor;
        }

        public void eat(){
            System.out.println(name + " is eating");
    }
        public void bark(){
        System.out.println(name + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", colour='" + colour + '\'' +
                '}';
    }
}
//THIS IS JUST FOR CREATING THE METHODS NO MAIN METHOD
/*
you have to figure out what attributes and actions we have
Attributes:
name
breed
age
gender
size
colour

Actions:
eat()
sleep()
play()
drink()
bark()

 */
