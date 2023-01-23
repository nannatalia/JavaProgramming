package day47_Polymoprhism;

interface vv {
    void read();
    abstract void watch();
}
abstract class Bbb implements vv{
    public void read(){
        System.out.println("read");
    }
}

public class Z extends Bbb {

    @Override
    public void watch() {

    }
}