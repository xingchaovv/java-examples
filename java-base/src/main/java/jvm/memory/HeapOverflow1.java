package jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Options: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOverflow1 {

    static class User {
        String name;
        Integer age;
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        while (true) {
            users.add(new User());
        }
        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        // at jvm.memory.HeapOverflow1.main(HeapOverflow1.java:16)
    }
}
