package fastjson_usage;

import com.alibaba.fastjson.JSON;
import java.util.Date;

/**
 * FastJSON 用法
 * <a href="https://kimmking.github.io/2017/06/06/json-best-practice/" />
 */
public class Usage1 {

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
        User chao = new User("chao", new Date());
        // {"createdTime":1707052762716,"username":"chao"}
        System.out.println(JSON.toJSONString(chao));
    }
}

