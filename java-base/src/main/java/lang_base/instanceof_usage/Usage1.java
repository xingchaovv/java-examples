package lang_base.instanceof_usage;

public class Usage1 {

    public static void main(String[] args) {
        CharSequence name = "Chao";
        if (name instanceof String) {
            System.out.printf("toUpperCase: %s\n", ((String) name).toUpperCase());
        }

        String name2 = null;
        System.out.printf("null instanceof String: %b\n", name2 instanceof String);
    }
}
