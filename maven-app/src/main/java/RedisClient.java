import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedisClient {

    public static RedissonClient obtainClient() {
        return Redisson.create(obtainConfig());
    }

    public static Config obtainConfig() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        return config;
    }
}
