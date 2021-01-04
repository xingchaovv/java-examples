package java_base_lang.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @example 反射用法：构造方法、方法、属性
 */
public class Usage2 {

    private String username;

    public Usage2() {
    }

    public Usage2(String name) {
        this.username = name;
    }

    public String getUsername() {
        return username;
    }

    private void setUserNameInner(String username) {
        this.username = username;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Usage2 usage = new Usage2();
        Class clazz = usage.getClass();
        System.out.printf("clazz: %s\n", clazz);
        System.out.printf("clazz.getSuperclass(): %s\n", clazz.getSuperclass());
        System.out.printf("clazz.getModifiers(): %s\n", clazz.getModifiers());

        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.printf("constructor: %s\n", constructor.getName());
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.printf("parameterType: %s; ", parameterType);
            }
            System.out.println();
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.printf("method: %s, returnType: %s\n", method.getName(), method.getReturnType());
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.printf("parameterType: %s; ", parameterType);
                System.out.printf("parameterType.getClass(): %s; ", parameterType.getClass());
            }
            System.out.println();
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.printf("field: %s, type: %s\n", field.getName(), field.getType());
        }
    }
}
