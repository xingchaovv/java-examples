package uuid;

import java.util.UUID;

/**
 * 在线资料：
 * UUID和UUID在java的实现 https://juejin.cn/post/7106399549844881421
 *
 *
 */
public class UUID_Example {

    public static void main(String[] args) {
        // 版本4：加密的强伪随机数
        UUID uuid = UUID.randomUUID();
        // UUID By Version 4: d51e8b22-ac66-4cd6-9966-2f042b847e72
        System.out.println("UUID By Version 4: " + uuid);

        // 版本3：MD5 方式
        UUID uuid2 = UUID.nameUUIDFromBytes(new byte[]{101, 102});
        // UUID By Version 3: feb78cc2-58bd-3768-a735-4f01c22dbe43
        System.out.println("UUID By Version 3: " + uuid2);
    }
}
