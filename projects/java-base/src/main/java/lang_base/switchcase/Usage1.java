package lang_base.switchcase;

public class Usage1 {

    public static void main(String[] args) {
        final int target1 = 3;
        int num = 12;
        switch (num) {
            case 1:
                System.out.println("get 1");
            case target1:
                System.out.println("get target1");
        }
    }
}
