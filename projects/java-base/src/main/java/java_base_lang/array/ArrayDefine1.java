package java_base_lang.array;

import java.util.Arrays;

public class ArrayDefine1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = new int[]{1, 2, 3, 4, 5};

        String[] names = {"Zhang", new String("Xing"), new String("Chao")};
        Arrays.stream(names).forEach(System.out::println);

        int[][] scores = {{3,6},{123,123,123},{1,2,4,5,6,7}};
    }
}
