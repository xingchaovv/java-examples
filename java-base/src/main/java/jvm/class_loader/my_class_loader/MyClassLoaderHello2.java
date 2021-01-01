package jvm.class_loader.my_class_loader;

public class MyClassLoaderHello2 {

    static {
        System.out.println("In the init of MyClassLoaderHello.");
    }

    public MyClassLoaderHello2() {
        System.out.println("In the constructor of MyClassLoaderHello.");
    }

    public void sayHello() {
        System.out.println("Hello!");
    }
}
