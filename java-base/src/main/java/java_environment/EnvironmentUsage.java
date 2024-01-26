package java_environment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.Map;

/**
 * 类 Environment 用法
 * 获取系统环境用法
 * 获取系统环境变量用法
 */
public class EnvironmentUsage {

    public static void main(String[] args) {
        Map<String, String> envInfos = System.getenv();
        System.out.println(JSON.toJSONString(envInfos, SerializerFeature.PrettyFormat));
        /**
         * 	输出内容：
         * 	"LOGNAME":"chao",
         * 	"LC_CTYPE":"zh_CN.UTF-8",
         * 	"PWD":"/Users/chao/projects/java-examples",
         * 	"XPC_SERVICE_NAME":"application.com.jetbrains.intellij.151821.156740",
         * 	"HOME":"/Users/chao"
         *
         */
    }
}
