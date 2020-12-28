package lang_base.trycatch;

public class Propagate {

    public static void main(String[] args) {
        Propagate propagate = new Propagate();
        try {
            String res = propagate.reverse("abc");
            System.out.println(res);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("end of reverse");
        }
        try {
            String res = propagate.reverse("");
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("end of reverse");
        }
    }

    private String reverse(String str) {
        if (str.length() == 0) {
            throw new RuntimeException("Wrong length");
        }
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
