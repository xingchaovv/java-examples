package java_base_util.stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example
 * Stream 类常见用法
 */
public class StreamUsage1 {

    @AllArgsConstructor
    @Data
    private class User {
        private String name;
        private Integer age;
    }

    private final List<User> users = new ArrayList<>();

    {
        users.add(new User("chao", 33));
        users.add(new User("lin", 30));
        users.add(new User("an", 25));
        users.add(new User("mike", 18));
        users.add(new User("harry", 12));
    }

    public static void main(String[] args) {
        StreamUsage1 streamUsage1 = new StreamUsage1();
        streamUsage1.test_foreach();
        streamUsage1.test_collect();
    }

    private void printUser(User user) {
        System.out.printf("user: %s\n", user);
    }

    private void printObject(Object object) {
        System.out.printf("object: %s\n", object);
    }

    private void test_foreach() {
        List<User> youngUsers = new ArrayList<>();
        users.stream().forEach((e) -> {
            if (e.getAge() <= 18 ) {
                youngUsers.add(e);
            }
        });
        System.out.printf("youngUsers: %s\n", youngUsers);

        users.stream().forEach(this::printUser);

        users.forEach(this::printUser);
        users.forEach(this::printObject);
    }

    private void test_collect() {
        System.out.printf("a list of names: %s\n", users.stream().map(User::getName)
                .collect(Collectors.toList())
        );

        System.out.printf("join name by comma: %s\n", users.stream().map(User::getName)
                .collect(Collectors.joining(","))
        );
    }
}
