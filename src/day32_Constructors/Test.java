package day32_Constructors;

public class Test {
    public Test(){
        System.out.println("A");
    }
    public Test(int a){
        this();
        System.out.println("B");
    }
    public Test(double a){
        this(10);
        System.out.println("C");
    }
    public Test(String str){
        this(76.6);
        System.out.println("D");
    }
    public static void main(String[] args) {
        Test test1 = new Test();
        System.out.println("------------------------------------");
        Test test2 = new Test(10);
        System.out.println("------------------------------------");
        Test test3 = new Test(21.1);
        System.out.println("------------------------------------");
        Test test4 = new Test("Akos");
    }
}
