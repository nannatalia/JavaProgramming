package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Nan Natalia");
        domain("nan_natalia@yahoo.ro");
        months(1);
    }
    public static void initials(String name){
        String initi = name.charAt(0) + "." + name.charAt(name.indexOf(" ")+1) + ".";
        System.out.println(initi);
    }
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@") +1, email.indexOf("."));
        System.out.println(domain);
    }
    public static void months(int n){
        String res1 = (n==1)? "January" :(n==2)? "February"
                :(n==3)? "March" :(n==4)? "April" :(n==5)? "May"
                :(n==6)? "June" :(n==7)? "July" :(n==8)? "August"
                :(n==9)? "September" :(n==10)? "October" :(n==11)? "November" :(n==12)? "December" : "Inavlid";
        System.out.println(res1);
    }
}
