package day45_Abstraction;

public interface PropertiesOfInterface {
//    int a;
//    static int b;
//
//    public PropertiesOfInterface(int a){
//        this.a=a;
//    }
//    static {
//        b=100;
//}
//        public void method1(){
//            System.out.println("Instance method");
//        }

        public static void method2(){
            System.out.println("Static method");
        }
        public abstract void method3();
        default void method4() {
            System.out.println("Default method");
        }
}

    class Test implements PropertiesOfInterface{
        @Override
        public void method3() {

        }

        public static void main(String[] args) {

            new Test().method4();

        }
    }
