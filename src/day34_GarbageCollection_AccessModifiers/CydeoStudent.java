package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String name;
    public static String schoolName;
    public CydeoStudent(String name){
        this.name = name;
    }
    static {
        schoolName = "Cydeo School";
    }
}

class CydeoStudentObject {

    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Katie");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }


}
