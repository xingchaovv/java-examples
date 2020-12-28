package java_base_lang.enums;

public class Main {

    enum SIZE {SMALL, MIDDLE, BIG};

    public static void main(String[] args) {
        CoffeeSize size1 = CoffeeSize.BIG;
        System.out.println(size1 == CoffeeSize.BIG);
        System.out.println(size1.getOunces());
        System.out.println(size1.BIG);
        System.out.println(CoffeeSize.BIG);

        System.out.println(SIZE.SMALL);
        System.out.println(Main.SIZE.SMALL);
    }
}
