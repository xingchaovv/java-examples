package jvm.class_loader.load_jar_dynamic;

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

    private void run() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, MalformedURLException, NoSuchFieldException, ClassNotFoundException {
        URL jarURL = Path.of("/Users/daniel/.m2/repository/org/redisson/redisson/3.14.0/redisson-3.14.0.jar").toUri().toURL();
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{jarURL}, ClassLoader.getSystemClassLoader());

        Field sclField = ClassLoader.class.getDeclaredField("scl");
        sclField.setAccessible(true);
        sclField.set(null, urlClassLoader);

        Thread.currentThread().setContextClassLoader(urlClassLoader);

        RedisDemo.demo();

//        Class<?> demoClazz = urlClassLoader.loadClass("jvm.class_loader.load_jar_dynamic.RedisDemo");
//        Method demoMethod = demoClazz.getDeclaredMethod("demo");
//        demoMethod.invoke(null);
    }
}
