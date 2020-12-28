package lang_base.scope;

public class Usage1 {

    private int count = 150;

    public static void main(String[] args) {
        int count = 100;
        if (true) {
            // int count = 2;
            int count2 = 200;
            System.out.println(count2);
        }
        // System.out.println(count2);
        int count2 = 250;
        System.out.println(count2);
    }
}
