package jvm.class_loader.load_jar_dynamic;

import org.redisson.Redisson;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedisDemo {

    public static void demo() {
        RedissonClient client = obtainClient();
        RAtomicLong viewCount = client.getAtomicLong("viewCount");
        System.out.printf("viewCount: %s\n", viewCount.addAndGet(100));
        client.shutdown();

        User user1 = new User();
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
