package fastjson_usage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

/**
 * FastJSON 用法
 */
public class Usage2 {

    private static class User {
        private String username;
        private Date createdTime;

        public User(String username, Date createdTime) {
            this.username = username;
            this.createdTime = createdTime;
        }

        public String getUsername() {
            return username;
        }

        public Date getCreatedTime() {
            return createdTime;
        }
    }

    public static void main(String[] args) {
        String jsonString = "{\"createdTime\":1707052762716,\"username\":\"chao\"}";

        Object obj1 = JSON.parse(jsonString);
        // 实际对象 JSONObject
        JSONObject jsonObj1 = (JSONObject) obj1;
        System.out.println(jsonObj1.getString("username"));

        // 类型转换 JSONObject
        JSONObject jsonOjb2 = (JSONObject) JSON.parse(jsonString);
        System.out.println(jsonOjb2.getString("username"));

        // 可以转换为 Long 1707052762716
        System.out.println(jsonOjb2.getLongValue("createdTime"));
        // 也可以转换为 Date Sun Feb 04 21:19:22 CST 2024
        System.out.println(jsonOjb2.getDate("createdTime"));
    }
}
