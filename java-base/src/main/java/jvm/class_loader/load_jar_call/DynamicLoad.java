package jvm.class_loader.load_jar_call;

import org.redisson.config.Config;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;

public class DynamicLoad {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException, MalformedURLException {
        new DynamicLoad().run();
    }

    private void run() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, MalformedURLException, NoSuchFieldException, ClassNotFoundException, InstantiationException {
        URL jarURL = new File("/Users/chao/.m2/repository/org/redisson/redisson/3.14.0/redisson-3.14.0.jar").toURI().toURL();
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{jarURL}, ClassLoader.getSystemClassLoader());

        Class<?> objClazz = urlClassLoader.loadClass("org.redisson.api.BatchOptions");
        Method method = objClazz.getDeclaredMethod("defaults");
        Object obj = method.invoke(null);
        System.out.println("obj: " + obj.toString());

        Class<?> obj2Clazz = urlClassLoader.loadClass("org.redisson.config.Config");
        Object obj2 = obj2Clazz.getConstructor().newInstance();
        System.out.println("obj2: " + obj2.toString());
    }
}
