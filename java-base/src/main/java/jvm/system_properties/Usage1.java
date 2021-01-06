package jvm.system_properties;

import java.util.Properties;

/**
 * @example System Properties 用法
 */
public class Usage1 {

    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.forEach((k, v)-> System.out.printf("%s: %s\n\n", k, v));

        String vmVersion = System.getProperty("java.vm.version");
        System.out.printf("vmVersion: %s\n", vmVersion);

        String notExisted123 = System.getProperty("notExisted123");
        System.out.printf("notExisted123: %s\n", notExisted123);
    }
}
