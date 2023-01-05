package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John",'M',25,2237,"Developer",100000,true);
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);


        Employee[] employees = { employee1, employee2, employee3, employee4, employee5 };
        int countFull = 0;
        int countPart = 0;
        double minimumSalary = employees[0].salary;
        double maximumSalary = employees[0].salary;
        for (Employee employee : employees) {
            if(employee.isFullTime)
                countFull++;
            else
                countPart++;
            if(employee.salary<minimumSalary)
                minimumSalary= employee.salary;
        }
        for (Employee employee : employees) {
            if(employee.salary>maximumSalary)
                maximumSalary=employee.salary;
        }
        System.out.println("countPart = " + countPart);
        System.out.println("countFull = " + countFull);
        System.out.println("minimumSalary = " + minimumSalary);
        System.out.println("maximumSalary = " + maximumSalary);
    }
}
