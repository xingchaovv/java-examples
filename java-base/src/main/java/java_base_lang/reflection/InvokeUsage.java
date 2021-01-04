package java_base_lang.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @example 反射：方法调用 Invoke
 */
public class InvokeUsage {

    private static class User {
        public String username;
        public User(String username) {
            this.username = username;
        }
        public String getUsername() {
            return username;
        }
        public String getUsername(String prefix) {
            return prefix + username;
        }
        public String toString() {
            return username;
        }
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        User chao = new User("chao");
        Class clazz = User.class;
        Method method1 = clazz.getMethod("getUsername");
        System.out.printf("method.invoke: %s\n", method1.invoke(chao));
        Method method2 = clazz.getMethod("getUsername", String.class);
        System.out.printf("method.invoke: %s\n", method2.invoke(chao, "Hello, "));
    }
}
