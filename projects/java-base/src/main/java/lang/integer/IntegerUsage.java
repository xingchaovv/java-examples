package lang.integer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IntegerUsage {

    public static void main(String[] args) {
        Integer n1 = 10001;
        Integer n2 = 10001;
        log.info("n1.hashCode(): {}", n1.hashCode());
        log.info("n2.hashCode(): {}", n2.hashCode());
        log.info("{}", n1 == n2);
        log.info("{}", n1.hashCode() == n2.hashCode());
        log.info("n1.equals(n2): {}", n1.equals(n2));
    }
}
