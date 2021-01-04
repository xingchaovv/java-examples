package java_base_lang.reflection;

import java.lang.reflect.Array;

/**
 * @example 反射：操作数组
 */
public class ArrayUsage {

    private static class User {
        public String username;
        public User(String username) {
            this.username = username;
        }
        public String toString() {
            return username;
        }
    }

    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("zhang");
        users[0] = new User("xing");
        users[0] = new User("chao");
        System.out.printf("users.length: %s\n", users.length);
        System.out.printf("users[0]: %s\n", users[0]);

        Class clazz = users.getClass();
        System.out.printf("clazz.isArray(): %s\n", clazz.isArray());
        System.out.printf("clazz.getComponentType(): %s\n", clazz.getComponentType());

        User[] users2 = (User[]) Array.newInstance(clazz.getComponentType(), users.length * 2);
        System.out.printf("users2.length: %s\n", users2.length);
        System.out.printf("users2[0]: %s\n", users2[0]);

//        users.length: 3
//        users[0]: chao
//        clazz.isArray(): true
//        clazz.getComponentType(): class java_base_lang.reflection.ArrayUsage$User
//        users2.length: 6
//        users2[0]: null
    }
}
