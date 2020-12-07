import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RAtomicLong;
import org.redisson.api.RedissonClient;

@Slf4j
public class Main {

    public static void main(String[] args) {
        testRedis();
    }

    private static void testRedis() {
        RedissonClient client = RedisClient.obtainClient();
        RAtomicLong viewCount = client.getAtomicLong("viewCount");
        log.info("viewCount: {}", viewCount.addAndGet(100));
    }
}
