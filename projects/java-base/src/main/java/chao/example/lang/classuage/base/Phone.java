package chao.example.lang.classuage.base;

public abstract class Phone {

    protected void turnOn() {
        System.out.println("The Phone turn on.");
    }

    protected abstract void bootstrap();

    void defaultAccessMethod() {
        System.out.println("Called defaultAccessMethod.");
    }

    private void thePhonePrivateMethod() {
        System.out.println("Called Phone#thePhonePrivateMethod.");
    }

    public final void sayHello() {
        System.out.println("Hello.");
    }

    // IEEE 754
    strictfp void testStrictfp() {
        System.out.println("Called testStrictfp.");
    }
}
