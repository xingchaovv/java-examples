package jvm.class_loader;

/**
 * @exampleoff Bootstrap 类加载器 - 测试
 */
public class BootstrapClassLoaderTest {

    public static void main(String[] args) {
        System.out.println("Bootstrap: " + String.class.getClassLoader());
        // Bootstrap: null

        System.out.println(System.getProperty("sun.boot.class.path"));
        //
    }
}
