package lang_base.trycatch;

public class ZeroExcpt {

    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 5 / x;
            // ArithmeticException
            //
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
