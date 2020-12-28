package lang_base.switchcase;

public class Usage3 {
    static final int target2 = 2;
    static final int target3;
    static {
        target3 = 3;
    }
    public static void main(String[] args) {
        int num1 = 101;
        final int target1 = 1;
        switch (num1) {
            case target1: {
                break;
            }
            case target2: {
                break;
            }
//            case target3: {
//                break;
//            }
        }
    }
}
