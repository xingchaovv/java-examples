package lang_base.switchcase;

public class Usage2 {

    public static void main(String[] args) {
        char ch1 = 'b';
        switch (ch1) {
            case 'a':
                System.out.println("is a");
                break;
            default :
                System.out.println("strange code");
            case 'b':
                System.out.println("is b");
                break;
        }
    }
}
