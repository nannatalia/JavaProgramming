package day42_Exceptions;

import day43_Abstraction.blblb;

class A {
    protected void method(){
        System.out.println("A");
    }
    private void method(int a){
        System.out.println("B");
    }
}
public class dsa extends A{
   //  @Override
     public void method(int a){
         System.out.println("C");
     }

    public static void main(String[] args) {
       dsa obj = new dsa();
       obj.method();
    }

}



