package day43_Abstraction.employeeTask;

public final class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, double salary) {
        super(name, age, gender,"Lyft Driver", id, salary);
    }

    public void work() {
        System.out.println(getName()+" is driving");

    }

    public void sleep() {
        System.out.println(getName()+" sleeps 10 hours");
    }
}
