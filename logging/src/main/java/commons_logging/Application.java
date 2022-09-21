package commons_logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Commons Logging 官方文档
 * https://commons.apache.org/proper/commons-logging/
 */
public class Application {

    public static void main(String[] args) {
        Log log = LogFactory.getLog(Application.class);

        log.info("测试 info 文本");
        log.warn("测试 warn 文本");
        log.fatal("测试 fatal 文本");
    }
}
