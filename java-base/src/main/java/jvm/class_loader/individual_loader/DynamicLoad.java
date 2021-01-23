package jvm.class_loader.individual_loader;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DynamicLoad {

    private User user;

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        new DynamicLoad().run();
    }

    private void run() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ClassLoader classLoader = getClass().getClassLoader();
        System.out.println("Got classLoader.");

        Class<?> userClass = classLoader.loadClass("jvm.class_loader.individual_loader.User");
        System.out.println("Loaded class for User.");

        Constructor userConstructor = userClass.getConstructor();
        System.out.println("Got userConstructor.");

        Object user = userConstructor.newInstance();
        System.out.println("Got user object.");

        String name = (String)userClass.getDeclaredField("name").get(user);
        System.out.println("The name of user:" + name);
    }
}
