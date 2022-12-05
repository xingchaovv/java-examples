package round_robin_number;

import java.util.concurrent.atomic.AtomicInteger;

class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.test1();
        main.test2();
    }

    private void test1() {
        Integer init = -5;
        Integer count = 3;
        for (; init <= 5; init++) {
            System.out.printf("number: %d, %% count: %d\n", calculate(init), calculate(init) % count);
        }
    }

    private void test2() {
        Integer init = Integer.MIN_VALUE;
        Integer count = 3;
        for (; init <= Integer.MIN_VALUE + 10; init++) {
            System.out.printf("original: %d, number: %d, %% count: %d\n", init, calculate(init), calculate(init) % count);
        }
    }

    private Integer calculate(Integer init) {
        return new AtomicInteger(init).incrementAndGet() & Integer.MAX_VALUE;
    }
}
