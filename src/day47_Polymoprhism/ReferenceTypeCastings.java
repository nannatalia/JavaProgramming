package day47_Polymoprhism;
import day43_Abstraction.employeeTask.*;
import day44_Abstraction.Animal.*;
import day45_Abstraction.Practice.BrowserTask.WebDriver;
import day45_Abstraction.Shape.*;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

       //Shape shape =(Shape) new Circle(5); //UPCASTING

      Shape shape1 = new Circle(5);

      //WebDriver driver = (ChromeDriver)new ChromeDriver();

      //Dog  dog2 =  new Dog("Max", "Husky", "White", 'M', 'S');
      //Dog dog3 = dog2;

      Animal animal = new Dog("Max", "Husky", "White", 'M', 'S');

//      Dog dog = (Dog) animal;  //DOWNCASTING
//      dog.bark();

        System.out.println( animal.getName() );
//        System.out.println( dog.getName() );

        (  (Dog)animal  ).bark();
        Shape shape2 = new Square(5);

        System.out.println( ((Square) shape2).getSide()  );


        System.out.println("---------------------------------------------------");

        Animal animal2 = new Cat("Jim", "Scotish", "White", 'M', 'S' );

//        Cat cat = (Cat) animal2;
//         cat.meow();

        ( (Cat) animal2 ).meow();

//         ( (Dog) animal2 ).bark();

        System.out.println("---------------------------------------------------");

        Employee employee = new Tester("Ali",30,'M',42,145000.00);

        ( (Tester)employee ).bugReport();

        //  ( (Tester)employee ).unitTest();

        //  ( (Developer)employee ).unitTest();

        //  Driver driver = (Driver) employee;  // line 1
        Person person = (Person) employee; // line 2
        //    Teacher teacher = (Teacher) employee; // line 3

        System.out.println("----------------------------------------------------");

        Shape s1 = new Circle(10);
        s1.area();
        s1.perimeter();

        //  ( (Cube)s1 ).volume();


    }
}
