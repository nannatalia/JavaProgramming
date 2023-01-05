package day40_FinalKeyword;

public class FinalVariable {
    final String birthDay;
    final static String name;

    static{
        name = "Batch 25";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {
        final double pi = 3.14;

        final String name;

        name = "Java";
        //   name = "Wooden Spoon";
        System.out.println(name);

        System.out.println("----------------------------------------");

        FinalVariable obj1 = new FinalVariable("16/08/2003");
        System.out.println(obj1.birthDay);

        System.out.println("----------------------------------------");

        System.out.println(FinalVariable.name);

    }

}
