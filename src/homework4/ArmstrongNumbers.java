package homework4;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        /*
        Task 3 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised
                to the power of three and added to obtain a number. If the number
                 obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits
         */
        armstrongNr(407);
    }
    public static void armstrongNr(int nr){
        if(nr>99){
            int unitati = (nr%100)%10;
            int zecimale = (nr%100)/10;
            int sute = nr/100;
            int armstrong = unitati*unitati*unitati + zecimale*zecimale*zecimale + sute*sute*sute;
            if(armstrong==nr){
                System.out.println(nr + " is an armstrong number");
            }else{
                System.out.println(nr + " is not an armstrong number");
            }
        }
    }
}
