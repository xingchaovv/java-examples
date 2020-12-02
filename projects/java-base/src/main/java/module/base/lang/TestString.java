package module.base.lang;

public class TestString {
    public static void main(String[] args) {
        // 字符构建器
        StringBuilder sb = new StringBuilder();
        sb.append("Xing");
        sb.append("Zhang");
        System.out.println(sb.toString());
        sb.insert(4,"chao ");
        System.out.println(sb.toString());
    }
}
