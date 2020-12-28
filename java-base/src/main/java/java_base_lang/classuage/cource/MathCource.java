package java_base_lang.classuage.cource;

public class MathCource extends Cource {
    public static String name = "数学";

    public static void showName() {
        System.out.println(name + " from MathCource");
    }

    public static void main(String[] args) {
        Cource c1 = new MathCource();
        c1.showName();
    }
}
