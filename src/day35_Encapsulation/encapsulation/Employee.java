package day35_Encapsulation.encapsulation;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private char gender;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name){
        if(name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(0);
        }
        this.name = name;
    }
    public void setAge(int age){
        if(age<=18 || age>=65){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }
    public void setGender(char gender){
        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender = gender;
    }
    public void setSalary(double salary){
        if(salary<=0){
            System.err.println("Invalid salary");
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
