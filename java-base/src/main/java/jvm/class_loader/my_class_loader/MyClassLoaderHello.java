package jvm.class_loader.my_class_loader;

public class MyClassLoaderHello {

    static {
        System.out.println("In the init of MyClassLoaderHello.");
    }

    public MyClassLoaderHello() {
        System.out.println("In the constructor of MyClassLoaderHello.");
    }

    public void sayHello() {
        System.out.println("Hello!");
        User user1 = new User();
    }
}
