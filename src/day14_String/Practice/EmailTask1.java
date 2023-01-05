package day14_String.Practice;

public class EmailTask1 {
    public static void main(String[] args) {
        /*
         7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and
        followed by an underscore and last name.

        Write a program that can swap first name with last name in the email
         (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
         */
        String mail = "mike_tyson@gmail.com";
        if(mail.contains("_")){
            System.out.println(mail.substring(mail.indexOf("_")+1, mail.indexOf("@")) + "_" + mail.substring(0,mail.indexOf("_")) + mail.substring(mail.indexOf("@")));
        }else {
            System.out.println(mail);
        }
    }
}
