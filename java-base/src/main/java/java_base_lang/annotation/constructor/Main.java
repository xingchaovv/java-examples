package java_base_lang.annotation.constructor;

public class Main {

    public static void main(String[] args) {
        // AllArgsConstructor
        Msg msg1 = new Msg(101, "My msg1");
        msg1.setStatus(102);
        System.out.println(msg1);
    }
}
