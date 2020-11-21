import java.util.Date;

public class CollaboratorWithFinalMethods {
    public final String helloMethod() {
        return "Hello World!";
    }

    public String getTimeDesc() {
        return new Date().toString();
    }
}
