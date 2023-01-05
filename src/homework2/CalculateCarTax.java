package homework2;

public class CalculateCarTax {
    public static void main(String[] args) {
        /*
        Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
         */
        int price = 70000;
        if(price>=20000 && price<=39999){
            System.out.println(price * 0.2);
        } else if (price >= 40000 && price<=59999) {
            System.out.println(price * 0.3);
        } else {
            System.out.println(price * 0.4);
        }
    }
}
