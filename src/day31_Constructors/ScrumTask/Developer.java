package day31_Constructors.ScrumTask;

public class Developer {
    public String name, jobTitle;
    public long id;
    public double salary;

    public Developer(String name, String jobTitle, long id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }
    public void coding(){
        System.out.println(name + " is coding");
    }
    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }
    public void fixingBug(){
        System.out.println(name + " is fixing bugs");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
