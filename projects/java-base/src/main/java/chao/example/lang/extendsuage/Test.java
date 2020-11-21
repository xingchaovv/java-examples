package chao.example.lang.extendsuage;

public class Test {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        System.out.println(t1 instanceof Test);
        System.out.println(t1 instanceof Object);
        System.out.println(t1.equals(t2));
    }
}
