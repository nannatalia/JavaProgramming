package day36_Inheritance.encapsulation;

import homework3.Grade;

public class Student {
    /*
    1. Create a class named Student:
			private variables:
				name, age, gender, grade, schoolName

			Encapsulate all the fileds (at least encapsulate two fields manually)
					requirments:
						1. age should not be set less than 5 or greater than 90
						2. gender should not be set to any chanarcter other than: 'M' and 'F'
						3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

			Add a constructor that can set all teh fields when the object is created
						(requirments of fileds in the above must be applied)


			Methods:
				study()
				toString()
     */
    private String name, schoolName;
    private int age;
    private char gender, grade;

    public Student(String name, String schoolName, int age, char gender, char grade) {
       setName(name);
       setAge(age);
       setSchoolName(schoolName);
       setGender(gender);
       setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAge(int age) {
        if(age<5 || age>90){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }

    public void setGrade(char grade) {
        if (!(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')){
            System.err.println("Invalid grade");
            System.exit(0);
        }
        this.grade = grade;
    }
    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }
}
