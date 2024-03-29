package redis.redisson;

import org.redisson.Redisson;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @example Redisson 简单初始化
 */
public class Usage1 {

    public static void main(String[] args) {
        RedissonClient client = obtainClient();

        RAtomicLong viewCount = client.getAtomicLong("viewCount");
        System.out.printf("viewCount: %s\n", viewCount.addAndGet(100));
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
