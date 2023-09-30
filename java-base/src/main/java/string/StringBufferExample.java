package string;

/**
 * StringBuffer 类的用法
 * 特点：线程安全
 */
public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Zhang");
        // Zhang
        System.out.println(buffer);

        buffer.insert(0, "Xingchao ");
        // Xingchao Zhang
        System.out.println(buffer);
    }
}
