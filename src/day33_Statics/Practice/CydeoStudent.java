package day33_Statics.Practice;

public class CydeoStudent {
    public String name;
    public char gander, grade;
    public int age, iD, batchNumber, groupNumber;
    public static String schoolName, programmingLanguage;

    public CydeoStudent(String name, char gander, char grade, int age, int iD, int batchNumber, int groupNumber) {
        this.name = name;
        this.gander = gander;
        this.grade = grade;
        this.age = age;
        this.iD = iD;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " is studying");
    }
    public void attendClass(){
        System.out.println(name + " is attending the class");
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gander=" + gander +
                ", grade=" + grade +
                ", age=" + age +
                ", iD=" + iD +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
