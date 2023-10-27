package example1201;

import java.util.Properties;

/**
 * 系统属性 System Properties 用法
 */
public class Usage1 {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        // sun.jnu.encoding: UTF-8
        // java.class.path:
        props.forEach((k, v)-> System.out.printf("%s: %s\n\n", k, v));

        String vmVersion = System.getProperty("java.vm.version");
        // vmVersion: 11.0.17+8
        System.out.printf("vmVersion: %s\n", vmVersion);

        String notExisted123 = System.getProperty("notExisted123");
        // notExisted123: null
        System.out.printf("notExisted123: %s\n", notExisted123);
    }
}
