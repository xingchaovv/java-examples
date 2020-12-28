package java_base_lang.excptusage;

public class Test1 {

    public static void main(String[] args) {
        (new Test1()).caller();
    }

    private void caller() {
        try {
            doSomeWork();
        } catch (RuntimeException e) {
            System.out.println("The catch work in exception.");
            throw e;
        } finally {
            System.out.println("The finally work in exception.");
        }
    }

    private void doSomeWork() {
        if (Math.random() > 0.5) {
            throw new RuntimeException("num bigger than 0.5");
        }
    }
}
