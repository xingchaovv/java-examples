package lang.annotation.data.annotation;

public class Main {

    public static void main(String[] args) {
        // 包含 final 成员的构建
        NumberedMsg numberedMsg = new NumberedMsg(101L);
        // Setter
        numberedMsg.setDesc("My msg1.");
        numberedMsg.setStatus(2);
        // ToString
        System.out.println(numberedMsg.toString());
        // Getter
        System.out.println(numberedMsg.getDesc());

        // 不包含 final 成员的构建
        Msg msg1 = new Msg();
        msg1.setDesc("My msg1.");
        msg1.setStatus(2);
        System.out.println(msg1.toString());
        System.out.println(msg1.hashCode());

        Msg msg2 = new Msg();
        msg2.setDesc("My msg2.");
        msg2.setStatus(2);
        System.out.println(msg2.hashCode());
        System.out.println(msg2.equals(msg1));
    }
}
