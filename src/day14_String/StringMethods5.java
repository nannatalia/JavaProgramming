package day14_String;

public class StringMethods5 {
    public static void main(String[] args) {
        String str = "cfdfdc";
       boolean r= str.isEmpty();
        System.out.println(r);

        boolean r2 = str.isBlank();
        System.out.println(r2);

        System.out.println("----------------------------------------------");
        String s1 = "cydeo"; String s2 = "CYDEO";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("----------------------------------------------");
        String sen = "My favorite programming language is Java";
        boolean res = sen.contains("C#");
        boolean res2 = sen.contains("Java");
        boolean res3 = sen.toLowerCase().contains("java");
        boolean res4 = sen.contains("Java") || sen.contains("java");
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);

        System.out.println("----------------------------------------------");
        String sentence1 = "I love jAvA";
        String sentence2 = "Java";
        System.out.println(sentence1.equals(sentence2));
        System.out.println(sentence1.equalsIgnoreCase(sentence2));
        System.out.println(sentence1.contains(sentence2));

        System.out.println(sentence1.toLowerCase().contains("java"));
        System.out.println(sentence1.toUpperCase().contains("JAVA"));

        System.out.println("----------------------------------------------");
        String a = "Wooden Spoon";
        boolean startsWithA = a.startsWith("Woo");
        boolean endsWithA = a.endsWith("oon");
        System.out.println(startsWithA);
        System.out.println(endsWithA);
    }
}
