package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {
        /*
        1.Write a program that can verify if a password is a strong password.
         Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

         */
        String password = "Cydeo1990!";
        boolean isStrongPassword = isOkey(password);
        System.out.println(isStrongPassword);
    }
    public static boolean isOkey(String password){

        boolean req1 = password.length()>=8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        char[] chars = password.toCharArray();
        for (char aChar : chars) {
            if(Character.isUpperCase(aChar))
                r2=true;
            else if(Character.isLowerCase(aChar))
                r3=true;
            else if(!Character.isLetterOrDigit(aChar))
                r4=true;
            else
                r5=true;
        }
        boolean isStrongPassword = req1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }
}
