package java_base_lang.primitive;

public class Usage1 {

    public static void main(String[] args) {
        double f1 = 123.45;
        double f2 = 123.00;
        double f3 = 123.0;
        float f4 = 123.0f;
        long l1 = 123;
        System.out.println((long)f1 == l1);
        System.out.println(f2 == (double)l1);
        System.out.println(f3 == l1);
        System.out.println(f4 == l1);

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
    }
}
