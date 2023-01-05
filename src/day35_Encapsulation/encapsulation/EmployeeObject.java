package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee e1 = new Employee("Akica", 'M', 25, 2333);
        System.out.println(e1);

        Employee employee2 = new Employee("Aygun", 'M', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary( employee2.getSalary() + 15000 );

        System.out.println(employee2);
    }
}
