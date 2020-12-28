package powermock;

import lombok.Data;

@Data
public class Dog {

    private String name;

    public static int getIntTen() {
        return 10;
    }

    public static String getHello() {
        return "Hello";
    }

    public String getAddress() {
        return getAddressByPrivate();
    }

    private String getAddressByPrivate() {
        return "Beijing";
    }

    public final int getAge() {
        return 20;
    }
}
