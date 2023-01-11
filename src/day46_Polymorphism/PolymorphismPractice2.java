package day46_Polymorphism;

import day43_Abstraction.employeeTask.*;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {
    public static void main(String[] args) {

        Employee[] employees = {
                new Tester("Sherali", 32, 'M', 1, 110000),
                new Developer("Zuhal", 27, 'F', 2, 128000),
                new Tester("George", 28, 'M', 3, 120000),
                new Developer("Cristina", 23, 'F', 4, 135000),
                new Tester("Cihad", 30, 'M', 5, 105000),
                new Developer("Gulistan", 26, 'F', 6, 130000),
                new Tester("Yuliya", 28, 'F', 7, 120000),
                new Developer("Cassendra", 29, 'F', 8, 140000),
                new Tester("Aygu", 25, 'F', 9, 130000),
                new Developer("Sophie", 26, 'F', 10, 150000),
                new Tester("Timur", 29, 'M', 11, 115000),
                new Developer("Fady", 26, 'F', 12, 142000),
                new Tester("Iryna", 24, 'F', 13, 125000),
                new Developer("Enes", 26, 'M', 14, 142000),
                new Tester("Mikael", 30, 'M', 15, 105000)};

    List<Employee> scrumMembers = new ArrayList<>();
    List<Tester> testers = new ArrayList<>();
    List<Developer> developers = new ArrayList<>();




        for (Employee employee : employees) {
            if(employee instanceof Tester || employee instanceof Developer){
                scrumMembers.add(employee);
            }
            if(employee instanceof Tester){
                testers.add((Tester) employee);
            }
            if(employee instanceof Developer){
                developers.add((Developer) employee);
            }
        }
        Tester testerMaxSalary = testers.get(1);
        Developer developerMaxSalary = developers.get(1);
        for (Tester tester : testers) {
            if(tester.getSalary()>testerMaxSalary.getSalary()){
                testerMaxSalary=tester;
            }
        }
        for (Developer developer : developers) {
            if(developer.getSalary()>developerMaxSalary.getSalary()){
                developerMaxSalary=developer;
            }
        }


        System.out.println(testerMaxSalary.getName() + ": " + testerMaxSalary.getSalary());
        System.out.println(developerMaxSalary.getName() + ": " + developerMaxSalary.getSalary());
    }
}