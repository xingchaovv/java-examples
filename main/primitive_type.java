package main;

/**
 * 原始类型
 */
public class primitive_type
{
    public static void main(String[] args) {
        // 整型

        // int
        int num1 = 20191001;
        System.out.printf("num1: %d\n", num1);
        // int最小值
        System.out.printf("Integer.MIN_VALUE: %d\n", Integer.MIN_VALUE);
        // int最小值 + 1 为 int最大值
        System.out.printf("Integer.MIN_VALUE - 1: %d\n", Integer.MIN_VALUE - 1);
        // int最大值
        System.out.printf("Integer.MAX_VALUE: %d\n", Integer.MAX_VALUE);
        // int最大值 - 1 为 int最小值
        System.out.printf("Integer.MAX_VALUE + 1: %d\n", Integer.MAX_VALUE + 1);

        // short
        short num2 = 2019;
        System.out.printf("num2: %d\n", num2);
        // short最小值
        System.out.printf("Short.MIN_VALUE: %d\n", Short.MIN_VALUE);
        // short最大值
        System.out.printf("Short.MAX_VALUE: %d\n", Short.MAX_VALUE);
    }
}