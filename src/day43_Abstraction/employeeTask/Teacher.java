package day43_Abstraction.employeeTask;

public final class Teacher extends Employee{

    public Teacher(String name, int age, char gender,  int id, double salary) {
        super(name, age, gender, "English Teacher", id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching.");

    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is slepping 8 hours.");

    }
}
