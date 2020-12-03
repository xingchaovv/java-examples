package redis.redisson;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

@Slf4j
public class Usage1 {

    public static void main(String[] args) {
        RedissonClient client = obtainClient();

        RAtomicLong viewCount = client.getAtomicLong("viewCount");
        log.info("viewCount: {}", viewCount.addAndGet(100));
    }

    private static RedissonClient obtainClient() {
        return Redisson.create(obtainConfig());
    }

    private static Config obtainConfig() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        return config;
    }
}
