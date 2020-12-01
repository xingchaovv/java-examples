package lang.array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUsage {

    public static void main(String[] args) {
        int[] nums1 = new int[]{101, 102, 103};

        for (int num : nums1) {
            System.out.println(num);
        }

        Collections.singletonList(nums1).forEach(System.out::println);
    }
}
