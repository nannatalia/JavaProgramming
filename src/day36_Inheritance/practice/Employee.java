package day36_Inheritance.practice;

public class Employee {
    public String name, jobTitle;
    public int age, ID;
    public double salary;

    public void setInfo(String name, String jobTitle, int age, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.ID = ID;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }
}
