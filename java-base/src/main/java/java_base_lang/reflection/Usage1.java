package java_base_lang.reflection;

import java.lang.reflect.InvocationTargetException;

/**
 * @example 反射用法1
 */
public class Usage1 {

    private String name;

    public Usage1() {
    }

    public Usage1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Usage1 usage1 = new Usage1();
        Class c1 = usage1.getClass();
        System.out.printf("c1: %s\n", c1);
        System.out.printf("c1.getName(): %s\n", c1.getName());
        System.out.printf("c1.getModifiers(): %d\n", c1.getModifiers());

        Class c2 = Class.forName("java_base_lang.reflection.Usage1");
        System.out.printf("c1 == c2: %s\n", c1 == c2);

        Class c3 = Usage1.class;
        System.out.printf("c1 == c3: %s\n", c1 == c3);

        Usage1 u11 = (Usage1) c1.getConstructor().newInstance();
        System.out.printf("u11.getName(): %s\n", u11.getName());

        Usage1 u12 = (Usage1) c1.getConstructor(String.class).newInstance("u12");
        System.out.printf("u12.getName(): %s\n", u12.getName());
    }
}
