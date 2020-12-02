package java_base_lang.classuage;

import java_base_lang.classuage.base.Phone;

public class Iphone extends Phone {

    public static void main(String[] args) {
        Iphone myPhone = new Iphone();
        myPhone.turnOn();
        myPhone.sayHello();
        myPhone.sayHello(1);
        myPhone.sayNums(101, 102, 103);
    }

    void Iphone() {

    }

    public void turnOn() {
        super.turnOn();
        System.out.println("The Iphone turn on.");
        thePhonePrivateMethod();
    }

    @Override
    public void bootstrap() {
        System.out.println("The Iphone bootstrap.");
    }

    public void sayHello(final int num) {
        // num++;
        System.out.println("Hello." + Integer.toString(num));
    }

    public void sayNums(int... nums) {
        for (int num : nums) {
            System.out.println("Say: " + num);
        }
    }

    private void thePhonePrivateMethod() {
        System.out.println("Called Iphone#thePhonePrivateMethod.");
    }
}
