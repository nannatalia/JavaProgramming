package day14_String.Practice;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        /*
        8. Create a class called EmailTask2.
       Assume that email address is constructed by person's
       first name and followed by an underscore and last name.
       Write a program that will print out information about user based on email.
        Print first name, last name, and domain.
       First and Last name should be printed with proper format - uppercase
       first letter and remaining lowercase.
               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple
         */
        Scanner input = new Scanner(System.in);
        String mail = input.nextLine();
        String firstName = "" + mail.substring(0, mail.indexOf("_"));
        String lastName = "" + mail.substring(mail.indexOf("_")+1, mail.indexOf("@"));
        String domain = "" + mail.substring(mail.indexOf("@")+1,mail.lastIndexOf("."));
        String ch = "" + firstName.charAt(0);
        String ch2 = ch.toUpperCase();
        System.out.println("First name: " + ch2 + firstName.substring(1));
        String ch3 = "" + lastName.charAt(0);
        String ch4 = ch3.toUpperCase();
        System.out.println("Last name: " + ch4 + lastName.substring(1));
        System.out.println("Domain: " + domain);
    }
}
