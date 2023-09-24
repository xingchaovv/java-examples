package properties;

import java.util.Properties;

/**
 * 属性 Properties 用法
 */
public class Usage1 {

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("username", "zhang");
        System.out.println(props);
    }
}
