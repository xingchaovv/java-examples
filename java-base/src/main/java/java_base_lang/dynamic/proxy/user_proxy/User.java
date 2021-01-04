package java_base_lang.dynamic.proxy.user_proxy;

public class User implements SayInterface {

    @Override
    public void sayDefaultMsg() {
        System.out.println("Hello 2021");
    }

    @Override
    public void sayFor(String arg) {
        System.out.println("Hello" + arg);
    }
}
