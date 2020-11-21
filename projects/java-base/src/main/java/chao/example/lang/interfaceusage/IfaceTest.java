package chao.example.lang.interfaceusage;

public class IfaceTest implements MyInterface {

    public static void main(String[] args) {
        new IfaceTest().go();
    }

    void go() {
        System.out.println("IfaceTest#doStuff: " + doStuff());
        System.out.println("MyInterface#doStuff: " + super.hashCode());
        System.out.println("MyInterface#doStuff: " + MyInterface.super.doStuff());
    }

    public int doStuff() {
        return 43;
    }
}
