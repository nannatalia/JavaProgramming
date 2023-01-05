package homework2;

public class CharacterIdentify {
    public static void main(String[] args) {
        /*
        4. Create a class called Character Identity, and write a program that can identify
if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the chracters on ASCII table

         */
        char ch = 'A';
        if((ch>=33 && ch <=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126)){
            System.out.println("Special Character");
        } else if (ch>=48 && ch<=57) {
            System.out.println("Digit");
        }else {
            System.out.println("Alphabetic Character");
        }


    }
}
