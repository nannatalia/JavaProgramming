package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("Akica", "Cydeo", 12, 'M', 'A');
        student1.setAge(32);
        System.out.println(student1);
    }
}
