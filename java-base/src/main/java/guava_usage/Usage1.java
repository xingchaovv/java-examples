package guava_usage;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Guava 用法、例子
 * Guava 是 Google 开发的一套开源 Java 库，旨在提高 Java 开发的效率和简洁性。
 * 它提供了大量的工具类和方法，涵盖了集合、缓存、并发、I/O、字符串处理等多个方面。
 * API 文档
 * https://guava.dev/releases/snapshot-jre/api/docs/
 */
public class Usage1 {

    public static void main(String[] args) {
        // Lists 工具
        ArrayList<String> names = Lists.newArrayList("zhang", "wang", "li");
        System.out.printf("check a is ascii: %s\n", names);
    }
}
