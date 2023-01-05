package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password = "Natica19!";
        boolean isStrongPassword = isOkay(password);
        System.out.println("isStrongPassword = " + isStrongPassword);
    }
    public static boolean isOkay(String password){
        boolean req1 = password.length()>=8 && !password.contains(" ");
        boolean isStrongPassword= false;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        char[] chars = password.toCharArray();
        for (char aChar : chars) {
            if(Character.isUpperCase(aChar))
                count1++;
            else if (Character.isLowerCase(aChar)) {
                count2++;
            } else if (Character.isDigit(aChar)) {
                count3++;
            }else
                count4++;
        }
        if(count1>0 && count2>0 && count3>0 && count4>0 && req1){
            isStrongPassword=true;
        }
        return isStrongPassword;
    }
}
