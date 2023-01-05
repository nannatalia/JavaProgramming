package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); // new string object
        System.out.println(str);
        System.out.println(str2);

        System.out.println("------------------------------------------------");

        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo", "gmail");
        System.out.println(email);
        System.out.println(email2);

        System.out.println("------------------------------------------------");

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace(" Python", "");
        System.out.println(sentence);
        System.out.println(sentence2);



        String s = "C# is fun, C# is cool";
        String s2 = s.replace(" C#", " Java" );
        System.out.println(s);
        System.out.println(s2);

        System.out.println("------------------------------------------------");

        String result = "Java Java Java";
        String r = result.replaceFirst("Java", "Python");
        System.out.println(result);
        System.out.println(r);

        System.out.println("------------------------------------------------");

        String result2 = "C# is fun, C# is cool";
        String r2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);
        System.out.println(r2);
    }
}
