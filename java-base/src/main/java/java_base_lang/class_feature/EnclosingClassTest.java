package java_base_lang.class_feature;

/**
 * @example 外围类获取用法、关系观察
 */
public class EnclosingClassTest {

    class Life {
        public void show() {
            System.out.printf("%s inner in %s\n", getClass().getName(), getClass().getEnclosingClass().getName());

            new Runnable() {
                {
                    run();
                }
                @Override
                public void run() {
                    System.out.printf("%s inner in %s\n", getClass().getName(), getClass().getEnclosingClass().getName());
                }
            };
        }
    }

    public void show() {
        new Life().show();
    }

    public static void main(String[] args) {
        new EnclosingClassTest().show();
    }
}
