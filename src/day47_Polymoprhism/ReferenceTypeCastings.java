package day47_Polymoprhism;
import day43_Abstraction.employeeTask.*;
import day44_Abstraction.Animal.*;
import day45_Abstraction.Shape.*;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Shape shape1 =(Shape) new Circle(5); //UPCASTING
      //Shape shape = new Circle(3);
    }
}
