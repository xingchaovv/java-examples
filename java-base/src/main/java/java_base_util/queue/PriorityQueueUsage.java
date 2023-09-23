package java_base_util.queue;

import java.util.*;

public class PriorityQueueUsage {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 8, 2, 5};
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            numbers.add(num);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> -o1.compareTo(o2));
        queue.addAll(numbers);
        System.out.printf("queue: %s\n", queue);
        while (!queue.isEmpty()) {
            System.out.printf("removed: %s\n", queue.remove());
        }
    }
}
