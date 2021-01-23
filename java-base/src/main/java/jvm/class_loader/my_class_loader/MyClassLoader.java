package jvm.class_loader.my_class_loader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyClassLoader extends ClassLoader {

    private final Path classDir;

    public MyClassLoader() {
        super();
        classDir = Path.of("/Users/chao/Documents/ChaoProjects/Java Projects/java-example/java-base/src/main/resources/jvm/class_loader/my_class_loader");
    }

    @Override
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        // /tmp/MyClassLoader/jvm.class_loader.my_class_loader.MyClassLoaderHello.class
        File classFile = Path.of(classDir + "/" + className + ".class").toFile();
        if (!classFile.exists()) {
            throw new ClassNotFoundException(className);
        }
        byte[] classBytes;
        try {
            classBytes = Files.readAllBytes(classFile.toPath());
        } catch (IOException e) {
            System.out.println(e);
            throw new ClassNotFoundException(className);
        }
        return defineClass(className, classBytes, 0, classBytes.length);
    }
}
