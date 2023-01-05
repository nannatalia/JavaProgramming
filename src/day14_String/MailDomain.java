package day14_String;

public class MailDomain {
    public static void main(String[] args) {
        /*

1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
         */
        String email = "nan.natalia@yahoo.ro";
        int beginnerIndex = email.indexOf("@") +1;
        int lastIndex = email.lastIndexOf(".");
        String email2 = email.substring(beginnerIndex, lastIndex);
        System.out.println(email);
        System.out.println(email2);

        System.out.println();

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, 10 +1);
        System.out.println(s1);
        String s2 = str1.substring(str1.indexOf(" J")+1, str1.lastIndexOf(","));
        System.out.println(s2);
        String s3 = str1.substring(str1.lastIndexOf("I" ));
        System.out.println(s3);

    }
}
