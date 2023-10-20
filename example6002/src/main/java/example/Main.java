package example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Apache Log4j2 用法
 */
public class Main {

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        System.out.printf("logger 名称: %s\n", logger.getName());
        logger.info("输出一些 INFO 级别的文字");
        logger.error("输出一些 ERROR 级别的文字");

        Logger myLogger = LogManager.getLogger("myLogger");
        System.out.printf("logger 名称: %s\n", myLogger.getName());
        myLogger.info("输出一些 INFO 级别的文字");
        myLogger.error("输出一些 ERROR 级别的文字");
    }
}
