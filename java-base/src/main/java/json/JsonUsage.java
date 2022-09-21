package json;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class JsonUsage {

    private static class User {
        private String username;
        private Date createdTime2;

        public User(String username, Date createdTime) {
            this.username = username;
            this.createdTime2 = createdTime;
        }

        public String getUsername() {
            return username;
        }

        public Date getCreatedTime() {
            return createdTime2;
        }
    }

    public static void main(String[] args) {
        User chao = new User("chao", new Date());
        System.out.println("json for chao: " + JSON.toJSONString(chao));
    }
}
