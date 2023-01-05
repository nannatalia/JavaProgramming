package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "                batch 25           ";
        str1 = str1.trim();
        System.out.println(str1);

        System.out.println("----------------------------");

        String str2 = "Cydeo School";
        int indexNr = str2.indexOf('h');
        System.out.println(indexNr);

        int indexNr2 = str2.indexOf("ol");
        System.out.println(indexNr2);

        System.out.println("----------------------------");

        String  str3 = "Java Programming Language";
        int indexNr3 = str3.indexOf("an");

        int indexNr4 = str3.indexOf("gua");

        System.out.println(indexNr3);
        System.out.println(indexNr4);

        int indexNr5 = str3.lastIndexOf('g');

        System.out.println(indexNr5);

        System.out.println("----------------------------");

        String s = "Java Nova Cava Wawa Orange";
        int firstA = s.indexOf('a');
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA =s.indexOf("ava W");
        //int fourthA =s.lastIndexOf("av");
        int fourthA = s.indexOf("Ca") + 1;
        int fifthA =s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("awa");
        int seventhA = s.lastIndexOf("a ");
        int lastA = s.lastIndexOf('a');
        System.out.println("firstA = " + firstA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);
        System.out.println("lastA = " + lastA);

    }
}
