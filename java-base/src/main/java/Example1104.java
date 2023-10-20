import org.apache.commons.text.StringSubstitutor;

import java.util.HashMap;
import java.util.Map;

/**
 * StringSubstitutor 字符串替换器（变量）、字符替换工具
 * 参考文档：<a href="https://commons.apache.org/proper/commons-text/apidocs/org/apache/commons/text/StringSubstitutor.html">...</a>
 */
public class Example1104 {

    public static void main(String[] args) {
        String systemInfo = StringSubstitutor
                .replaceSystemProperties("You are running with java.version = ${java.version} and os.name = ${os.name}.");
        // You are running with java.version = 11.0.17 and os.name = Mac OS X.
        System.out.println(systemInfo);

        // 参数变量
        Map<String, String> params = new HashMap<>();
        params.put("name", "zhang");
        params.put("age", "18");
        // 模板
        String template = "Name: ${name}, Age: ${age}";
        StringSubstitutor sub = new StringSubstitutor(params);
        String replaced = sub.replace(template);
        System.out.println(replaced);
    }
}
