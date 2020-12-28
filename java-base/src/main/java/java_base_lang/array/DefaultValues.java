package java_base_lang.array;

public class DefaultValues {

    private int[] num3;
    private int[] num4 = new int[5];

    public static void main(String[] args) {
        int[] nums = new int[5];
        System.out.println(nums[0]);

        int[] nums2;
        nums2 = new int[3];
        System.out.println(nums[0]);

        DefaultValues v1 = new DefaultValues();
        System.out.println(v1.num3);
        System.out.println(v1.num4[0]);
    }
}
