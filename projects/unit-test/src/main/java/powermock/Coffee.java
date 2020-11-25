package powermock;

import java.util.Date;

public class Coffee {
    public final String helloMethod() {
        return "Hello World!";
    }

    public String getTimeDesc() {
        return new Date().toString();
    }
}
