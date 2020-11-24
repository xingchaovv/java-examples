package lang.excptusage.Excpt1;

public class Propagate {

    public static void main(String[] args) {
        try {
            System.out.println("In the try.");
            reverse("abc");
            reverse("");
        } catch (Exception e) {
            System.out.println("In the catch.");
        } finally {
            System.out.println("In the finally.");
        }
    }

    private static String reverse(String str) {
        if (str.length() == 0) {
            throw new RuntimeException("Empty Str Error.");
        }
        return String.valueOf(new StringBuffer(str).reverse());
    }
}
