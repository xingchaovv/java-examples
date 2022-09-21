package java_base_lang.reflection.private_value;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @example 反射：获取私有变量的值
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = User.class;
        Field usernameField = clazz.getDeclaredField("username");
        User chao = new User("chao");
        System.out.printf("clazz: %s\n", clazz);

        usernameField.setAccessible(true);

        try {
            System.out.printf("username1: %s\n", usernameField.get(chao));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.printf("username2: %s\n", usernameField.get(chao));

        usernameField.set(chao, "new chao");
        System.out.printf("username3: %s\n", usernameField.get(chao));
    }
}
