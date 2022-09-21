package collection.stream_test;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @example Stream 常见用法
 */
public class StreamUsage {

    private static class User {
        private String name;
        private Integer age;
        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Integer getAge() {
            return age;
        }
        public void setAge(Integer age) {
            this.age = age;
        }
    }

    private static class Helper {

        private static void printUser(User user) {
            System.out.printf("user: %s\n", user);
        }
        private static void printObject(Object object) {
            System.out.printf("object: %s\n", object);
        }
        private static boolean nonEmptyCs(CharSequence cs) {
            return cs.length() > 0;
        }
        private static boolean emptyCs(CharSequence cs) {
            return cs.length() == 0;
        }
    }

    private final List<User> users;
    {
        users = new ArrayList<>();
        users.add(new User("chao", 33));
        users.add(new User("lin", 30));
        users.add(new User("lin2", 30));
        users.add(new User("an", 25));
        users.add(new User("mike", 18));
        users.add(new User("harry", 12));
    }

    public static void main(String[] args) {
        StreamUsage usage = new StreamUsage();
        usage.test_foreach();
        usage.test_collect();
        usage.test_allMatch();
        usage.test_noneMatch();
        usage.test_findFirst();
        usage.test_empty();
        usage.test_sorted();
    }

    private void test_foreach() {
        List<User> youngUsers = new ArrayList<>();
        users.stream().forEach((e) -> {
            if (e.getAge() <= 18 ) {
                youngUsers.add(e);
            }
        });
        System.out.printf("youngUsers: %s\n", youngUsers);

        users.stream().forEach(Helper::printUser);
        users.stream().forEach(Helper::printObject);
    }

    private void test_collect() {
        System.out.printf(
            "a list of names: %s\n",
            users.stream().map(User::getName).collect(Collectors.toList())
        );

        System.out.printf(
            "join name by comma: %s\n",
            users.stream().map(User::getName).collect(Collectors.joining(","))
        );
    }

    private void test_allMatch() {
        System.out.printf(
            "all names are not empty: %s\n",
            users.stream().map(User::getName).allMatch(Helper::nonEmptyCs)
        );
    }

    private void test_noneMatch() {
        System.out.printf(
                "any name is not empty: %s\n",
                users.stream().map(User::getName).noneMatch(Helper::emptyCs)
        );
    }

    private void test_findFirst() {
        Set<String> names = new HashSet<String>(){{
            add("chao"); add("zhang"); add("aaa");
        }};
        // If the stream has no encounter order, then any element may be returned.
        System.out.printf(
                "findFirst: %s\n",
                names.stream().findFirst()
        );
    }

    private void test_empty() {
        System.out.printf(
                "empty stream: %s\n",
                Stream.<String>empty()
        );
    }

    private void test_sorted() {
        System.out.printf(
                "sorted by name: %s\n",
                users.stream().sorted(Comparator.comparing(User::getName))
                        .collect(Collectors.toList())
        );

        System.out.printf(
                "sorted by age_name: %s\n",
                users.stream().sorted(Comparator.comparing((e) -> e.getAge() + "_" + e.getName()))
                        .collect(Collectors.toList())
        );
    }
}
