package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static{ // runs before anything and only one time
        System.out.println("Static Block 1");
    }
    static{ // runs before anything and only one time
        System.out.println("Static Block 2");
    }
    static{ // runs before anything and only one time
        System.out.println("Static Block 3");
    }
}
