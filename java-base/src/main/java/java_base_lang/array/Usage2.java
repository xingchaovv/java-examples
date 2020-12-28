package java_base_lang.array;

public class Usage2 {

    public static void main(String[] args) {
        int[][] nums = new int[3][5];
        for (int[] oneNums : nums) {
            System.out.println(oneNums.length);
        }
    }
}
