package logging_util;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java Logging 官方文档
 * <a href="https://docs.oracle.com/en/java/javase/11/core/java-logging-overview.html#GUID-B83B652C-17EA-48D9-93D2-563AE1FF8EDA">...</a>
 */
public class Example1103 {

    public static void main(String[] args) {
        // 获取 Logger
        Logger logger = Logger.getGlobal();

        // 10月 19, 2023 7:31:40 下午 logging_util.Example1103 main
        // 信息: 测试 INFO 文本
        logger.info("测试 INFO 文本");
        // 10月 19, 2023 7:31:40 下午 logging_util.Example1103 main
        // 警告: 测试 WARNING 文本
        logger.warning("测试 WARNING 文本");
        // 10月 19, 2023 7:31:40 下午 logging_util.Example1103 main
        // 严重: 测试 SEVERE 文本
        logger.severe("测试 SEVERE 文本");

        // 设置默认日志级别，低于此级别不再显示
        logger.setLevel(Level.WARNING);
        // 无输出
        logger.info("测试 INFO 文本");
        // 10月 19, 2023 7:31:40 下午 logging_util.Example1103 main
        // 警告: 测试 WARNING 文本
        logger.warning("测试 WARNING 文本");
    }
}
