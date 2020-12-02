package java_base_lang.primitive;

/**
 * 原始类型
 */
public class PrimitiveType
{
    public static void main(String[] args) {
        // 整型

        // byte
        byte byteNum = 125;
        System.out.printf("byteNum: %d\n", byteNum);
        // byte最小值
        System.out.printf("Byte.MIN_VALUE: %d\n", Byte.MIN_VALUE);
        // byte最大值
        System.out.printf("Byte.MAX_VALUE: %d\n", Byte.MAX_VALUE);

        // short
        short num2 = 2019;
        System.out.printf("num2: %d\n", num2);
        // short最小值
        System.out.printf("Short.MIN_VALUE: %d\n", Short.MIN_VALUE);
        // short最大值
        System.out.printf("Short.MAX_VALUE: %d\n", Short.MAX_VALUE);

        // int
        int num1 = 20191001;
        System.out.printf("num1: %d\n", num1);
        // int最小值
        System.out.printf("Integer.MIN_VALUE: %d\n", Integer.MIN_VALUE);        
        // int最大值
        System.out.printf("Integer.MAX_VALUE: %d\n", Integer.MAX_VALUE);

        /**
         * 警惕越界问题
         */
        // int最小值 + 1 为 int最大值
        System.out.printf("Integer.MIN_VALUE - 1: %d\n", Integer.MIN_VALUE - 1);
        // int最大值 - 1 为 int最小值
        System.out.printf("Integer.MAX_VALUE + 1: %d\n", Integer.MAX_VALUE + 1);

        // long
        long longNum = 1234567890123456789L;
        System.out.printf("longNum: %d\n", longNum);
        // long最小值
        System.out.printf("Long.MIN_VALUE: %d\n", Long.MIN_VALUE);
        // long最大值
        System.out.printf("Long.MAX_VALUE: %d\n", Long.MAX_VALUE);

        // float
        float floatNum = 36.7f;
        System.out.printf("floatNum: %f\n", floatNum);
        // float最小值
        System.out.printf("Float.MIN_VALUE: %f\n", Float.MIN_VALUE);        
        // float最大值
        System.out.printf("Float.MAX_VALUE: %f\n", Float.MAX_VALUE);

        // double
        double doubleNum = 3.1415926;
        System.out.printf("doubleNum: %f\n", doubleNum);
        // double最小值
        System.out.printf("Double.MIN_VALUE: %f\n", Double.MIN_VALUE);        
        // double最大值
        System.out.printf("Double.MAX_VALUE: %f\n", Double.MAX_VALUE);

        // boolean
        boolean boolVal = true;
        System.out.printf("boolVal: %s\n", boolVal);

        // char
        char char1 = 65;
        System.out.printf("char1: %s\n", char1);
        char char2 = 'B';
        System.out.printf("char2: %s\n", char2);
        char char3 = '\\';
        System.out.printf("char3: %s\n", char3);
        // char最小值
        System.out.printf("Character.MIN_VALUE: %d\n", (int)Character.MIN_VALUE);
        // char最大值
        System.out.printf("Character.MAX_VALUE: %d\n", (int)Character.MAX_VALUE);
    }
}