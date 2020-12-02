package java_base_lang.classuage.phone;

public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println(iphone.toString());

        Iphone iphone2 = new Iphone("1.0");
        System.out.println(iphone2.toString());
    }
}
