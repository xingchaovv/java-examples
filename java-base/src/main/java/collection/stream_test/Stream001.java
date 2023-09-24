package collection.stream_test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream001 {

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

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("cai", 11));
        users.add(new User("mai", 12));
        users.add(new User("zhang", 12));

        System.out.println(
            users.stream().map(User::getAge).collect(Collectors.toList())
        );

        // distinct 用法
        System.out.println(
                users.stream().map(User::getAge).distinct().collect(Collectors.toList())
        );
    }
}
