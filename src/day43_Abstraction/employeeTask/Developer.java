package day43_Abstraction.employeeTask;

public final class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, "Developer", id, salary);
    }

    public void work() {
        System.out.println(getName()+" is developing application");
    }

    public void sleep() {
        System.out.println(getName()+" sleeps 6 hours");
    }
    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }
}
