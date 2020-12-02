package lang.annotation.builder;

public class Main {

    public static void main(String[] args) {
        Msg msg1 = Msg.builder()
                .id(101L).status(1).desc("My Msg.")
                .build();
        System.out.println(msg1.toString());
    }
}
