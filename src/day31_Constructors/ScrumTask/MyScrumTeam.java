package day31_Constructors.ScrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Layan", "QA",11 , 110000 );
        Tester tester2=new Tester("Ali","SDET",43,142000);
        Tester tester3=new Tester("Alex","SE",44,135000);
        Tester tester4= new Tester("Lala", "SDET",23,115000);

        Tester[] testers = {tester2, tester3, tester4};

        Developer developer1 = new Developer("Olga", "Java Developer", 22, 125000);
        Developer developer2= new Developer("Aygun", "Java Master", 39, 185000);
        Developer developer3 = new Developer("Tunc", "Software Developer", 28, 135000);
        Developer developer4= new Developer("Sinem","Senior Developer" , 13,200000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Nadir", "Adam", "Asiya", 14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        scrum.addTesters(testers);
        scrum.addDevelopers( developers );

        System.out.println(scrum);

        System.out.println("------------------------------------------------------");

        for (Tester tester : scrum.testersList) {
            System.out.println(tester.name + " : $" + tester.salary);
        }

        System.out.println("------------------------------------------------------");

        for (Developer developer : scrum.devopsList) {
            System.out.println(developer.name + " : $" + developer.salary);
        }

        scrum.removeTester(23);
        System.out.println(scrum);
        scrum.removeDeveloper(22);
        System.out.println(scrum);


    }
}
