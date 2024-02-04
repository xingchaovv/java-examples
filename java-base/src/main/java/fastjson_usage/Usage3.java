package fastjson_usage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

/**
 * FastJSON 用法
 */
public class Usage3 {

    private static class User {
        private String username;
        private Date createdTime;

        public User() {
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", createdTime=" + createdTime +
                    '}';
        }
    }

    public static void main(String[] args) {
        String jsonString = "{\"createdTime\":1707052762716,\"username\":\"chao\"}";

        User user1 = JSON.parseObject(jsonString, User.class);
        System.out.println(user1);
    }
}
