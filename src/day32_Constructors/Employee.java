package day32_Constructors;

public class Employee {
    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, char gender) {
        this(name, gender);
        this.jobTitle = jobTitle;

    }

    public Employee(String name, String jobTitle, char gender, double salary) {
        this(name, jobTitle, gender);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary= $" + salary +
                '}';
    }
}
