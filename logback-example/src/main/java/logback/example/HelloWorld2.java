package logback.example;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld2 {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(HelloWorld2.class);
        logger.info("开始 main 方法");
        logger.debug("调试一下 main 方法");

        LoggerContext loggerContext = (LoggerContext)LoggerFactory.getILoggerFactory();
        StatusPrinter.print(loggerContext);
    }
}
