package jvm.class_loader.my_class_loader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @example 自定义类加载器
 */
public class Launcher {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> helloClass = myClassLoader.loadClass("jvm.class_loader.my_class_loader.MyClassLoaderHello");
        System.out.printf("name: %s, loader: %s\n", helloClass.getName(), helloClass.getClassLoader());

        Object helloObj = helloClass.getDeclaredConstructor().newInstance();
        System.out.printf("Object: %s\n", helloObj);

        Method sayHelloMethod = helloClass.getMethod("sayHello");
        System.out.println("start: sayHelloMethod.invoke(helloObj)");
        sayHelloMethod.invoke(helloObj);
    }
}
