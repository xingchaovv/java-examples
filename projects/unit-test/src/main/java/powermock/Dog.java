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
}
