package chao.example.lang.enums;

public enum CoffeeSize {

    BIG(10),
    HUGE(20),
    MIDDLE(5);

    private int ounces;

    CoffeeSize(int i) {
        ounces = i;
    }

    public int getOunces() {
        return ounces;
    }
}
