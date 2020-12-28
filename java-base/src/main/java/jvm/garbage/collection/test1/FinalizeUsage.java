package jvm.garbage.collection.test1;

public class FinalizeUsage {

    public static void main(String[] args) {
        FinalizeUsage u1 = new FinalizeUsage();
        System.out.println("End of method main");
    }

    /**
     * Deprecated method from Java 9
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("In method finalize");
    }
}
