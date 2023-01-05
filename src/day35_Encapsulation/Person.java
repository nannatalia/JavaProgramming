package day35_Encapsulation;

public class Person {
    /*
    1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
     */
    public String name, language;
    public int age;
    public static String planet = "Earth";
    public static int numberOfWings = 0, numberOfHead = 1;
    public static boolean isHuman = true, hasNose = true;

    public Person(String name, String language, int age) {
        this.name = name;
        this.language = language;
        this.age = age;
    }
    public static void printPlanetName(){
        System.out.println(planet);
    }
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age + ", planet= " + planet + ", number of wings= " + numberOfWings + ", number of head= " + numberOfHead + ", is human= " + isHuman + ", has nose= " + hasNose +
                '}';
    }
}
