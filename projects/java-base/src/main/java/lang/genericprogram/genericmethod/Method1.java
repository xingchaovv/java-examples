package lang.genericprogram.genericmethod;

public class Method1 {

    public static <T> T getMiddle(T ...a) {
        return a[a.length/2];
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("a", "b", "c"));
        System.out.println(getMiddle(101, 105, 111));
        double m1 = getMiddle(1.1, 2d, 0d);
    }
}
