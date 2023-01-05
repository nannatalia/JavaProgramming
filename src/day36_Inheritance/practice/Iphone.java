package day36_Inheritance.practice;

public class Iphone extends Phone{
    public void facetime(long phoneNr){
        System.out.println("Facetiming " + phoneNr);
    }
    public void facetime(String mail){
        System.out.println("Facetiming " + mail);
    }
}
