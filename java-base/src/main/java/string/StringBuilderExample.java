package string;

/**
 * StringBuilder 类的用法
 * 特点：线程不安全
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        // 字符构建器
        StringBuilder sb = new StringBuilder();

        sb.append("Xing");
        sb.append("Zhang");
        // XingZhang
        System.out.println(sb);

        sb.insert(4,"chao ");
        // Xingchao Zhang
        System.out.println(sb);

        StringBuilder name1 = new StringBuilder("Zhang chao");
        // Zhang chao
        System.out.println(name1);

        // oahc gnahZ
        name1.reverse();
        System.out.println(name1);

        name1.reverse();
        name1.insert(6, "Xing");
        // Zhang Xingchao
        System.out.println(name1);

        name1.delete(0, 6);
        // Xingchao
        System.out.println(name1);
    }
}
