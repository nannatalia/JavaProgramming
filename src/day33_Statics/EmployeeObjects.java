package day33_Statics;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Nati";
        employee1.salary = 3242433;
        Employee employee2 = new Employee();
        employee2.name = "Akos";
        employee2.salary = 1836632;
        Employee employee3 = new Employee();
        employee3.name = "Mila";
        employee3.salary = 7635328;
        System.out.println(employee1.name + ": $" + employee1.salary);
        System.out.println(employee2.name + ": $" + employee2.salary);
        System.out.println(employee3.name + ": $" + employee3.salary);

        System.out.println( employee1.isHuman );
        System.out.println( employee2.isHuman );
        System.out.println( employee3.isHuman );



        int a = 100;

        a = 200;

        a = 300;

    }
}
