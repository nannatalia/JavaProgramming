package day36_Inheritance.practice;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.setInfo("Iphone 12", "Pro","6.7 inches" , "Black", 32000);
        Samsung samsung = new Samsung();

        samsung.setInfo("galaxy S19", "900", "6 inches", "White", 4322);
        Nokia nokia = new Nokia();

        nokia.setInfo("Brick", "500", "4 inches", "Gray", 321);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.facetime(78945613);
        iphone.facetime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

    }
}
