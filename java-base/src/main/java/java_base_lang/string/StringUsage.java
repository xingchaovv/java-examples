package java_base_lang.string;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringUsage {

    public static void main(String[] args) {
        String name1 = "chao";
        String name2 = "chao";

        log.info("{}", name1.hashCode());
        log.info("{}", name2.hashCode());
        log.info("{}", name1.hashCode() == name2.hashCode());

        String c1 = "Aa";
        String c2 = "BB";
        log.info("c1.hashCode(): {}", c1.hashCode());
        log.info("c2.hashCode(): {}", c2.hashCode());
        log.info("c1 == c2: {}", c1 == c2);
        log.info("c1.hashCode() == c2.hashCode(): {}", c1.hashCode() == c2.hashCode());
        log.info("c1.equals(c2): {}", c1.equals(c2));

        StringUsage u1 = new StringUsage();
        StringUsage u2 = new StringUsage();
        log.info("{}", u1.hashCode());
        log.info("{}", u2.hashCode());
        log.info("{}", u1.hashCode() == u2.hashCode());
    }
}
