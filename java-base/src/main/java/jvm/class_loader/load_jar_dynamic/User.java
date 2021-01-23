package jvm.class_loader.load_jar_dynamic;

public class User {

    static {
        System.out.println("running init block of User static.");
    }

    public String name = "the default name";

    {
        System.out.println("running init block of User object.");
    }

    public User() {
        System.out.println("running constructor implement of User object.");
    }
}
