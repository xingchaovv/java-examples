package example1201;

/**
 * 从 JVM 虚机 java 命令参数设置系统属性
 */
public class Usage2 {

    public static void main(String[] args) {
        /**
         * 启动命令参数：-Dproperty=value
         * -Duser=zhang
         * 完整例子：% java -Duser=zhang -classpath xxx/target/classes system_properties.Usage2
         */
        String user = System.getProperty("user");
        System.out.printf("user: %s\n", user);
    }
}
