package day43_Abstraction.employeeTask;

public abstract class Employee extends Person{

    private final int id;
    private String jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        setSalary(salary);
        if(id <= 0){
            throw new RuntimeException("Invalid ID: "+id);
        }
        this.id=id;

    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

}
