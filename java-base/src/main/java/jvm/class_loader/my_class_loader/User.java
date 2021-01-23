package jvm.class_loader.my_class_loader;

public class User {

    static {
        System.out.println("running init block of User static.");
    }

    public String name = "this is default name";

    {
        System.out.println("running init block of User object.");
    }

    public User() {
        System.out.println("running constructor implement of User object.");
    }
}
