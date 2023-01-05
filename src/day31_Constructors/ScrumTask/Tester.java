package day31_Constructors.ScrumTask;

public class Tester {
    public String name, jobTitle;
    public long id;
    public double salary;

    public Tester(String name, String jobTitle, long id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }
    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name + " is creating a ticket");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
