package day33_Statics;

public class Student {
    /*
    1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade
				Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student
				Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

				Actions:
					toString()
					study()
     */
    public String name;
    public char gender, grade;
    public int age, studentID;

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, char gender){
        this(name);
        this.gender = gender;
    }
    public Student(String name, int studentID){
        this(name);
        this.studentID = studentID;
    }
    public Student(String name, int studentID, char grade){
        this(name, studentID);
        this.grade = grade;
    }
    public Student(String name, char gender, int age){
        this(name, gender);
        this.age = age;
    }
    public Student(String name, char gender , int age, int studentID){
        this(name, gender, age);
        this.studentID = studentID;
    }
    public Student(String name, char gender , int age, int studentID, char grade){
        this(name, gender, age, studentID);
        this.grade = grade;
    }
    public void Study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                '}';
    }
}
