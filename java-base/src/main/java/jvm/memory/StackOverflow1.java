package jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Options: -Xss144K
 */
public class StackOverflow1 {

    public int count;

    static class User {
        String name;
        Integer age;
    }

    public void findUser() {
        count++;
        findUser();
    }

    public static void main(String[] args) {
        StackOverflow1 stackOverflow1 = new StackOverflow1();
        try {
            stackOverflow1.findUser();
        } catch (Throwable t) {
            System.out.printf("Count: %d\n", stackOverflow1.count);
            throw t;

            // Count: 481
            // Exception in thread "main" java.lang.StackOverflowError
        }
    }
}
