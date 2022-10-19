package logback.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld1 {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(HelloWorld1.class);
        logger.info("开始 main 方法");
        logger.debug("调试一下 main 方法");
    }
}
