# Java 原始数据类型编程示例

## 示例文件

<!-- file:main/primitive_type.java -->
源文件 [../main/primitive_type.java](../src/main/java/com/xingchaovv/example/main/primitive_type.java)

```
package main;

/**
 * 原始类型
 */
public class primitive_type
{
    public static void main(String[] args) {
        // 整型

        // byte
        byte byteNum = 125;
        System.out.printf("byteNum: %dn", byteNum);
        // byte最小值
        System.out.printf("Byte.MIN_VALUE: %dn", Byte.MIN_VALUE);
        // byte最大值
        System.out.printf("Byte.MAX_VALUE: %dn", Byte.MAX_VALUE);

        // short
        short num2 = 2019;
        System.out.printf("num2: %dn", num2);
        // short最小值
        System.out.printf("Short.MIN_VALUE: %dn", Short.MIN_VALUE);
        // short最大值
        System.out.printf("Short.MAX_VALUE: %dn", Short.MAX_VALUE);

        // int
        int num1 = 20191001;
        System.out.printf("num1: %dn", num1);
        // int最小值
        System.out.printf("Integer.MIN_VALUE: %dn", Integer.MIN_VALUE);        
        // int最大值
        System.out.printf("Integer.MAX_VALUE: %dn", Integer.MAX_VALUE);

        /**
         * 警惕越界问题
         */
        // int最小值 + 1 为 int最大值
        System.out.printf("Integer.MIN_VALUE - 1: %dn", Integer.MIN_VALUE - 1);
        // int最大值 - 1 为 int最小值
        System.out.printf("Integer.MAX_VALUE + 1: %dn", Integer.MAX_VALUE + 1);

        // long
        long longNum = 1234567890123456789L;
        System.out.printf("longNum: %dn", longNum);
        // long最小值
        System.out.printf("Long.MIN_VALUE: %dn", Long.MIN_VALUE);
        // long最大值
        System.out.printf("Long.MAX_VALUE: %dn", Long.MAX_VALUE);

        // float
        float floatNum = 36.7f;
        System.out.printf("floatNum: %fn", floatNum);
        // float最小值
        System.out.printf("Float.MIN_VALUE: %fn", Float.MIN_VALUE);        
        // float最大值
        System.out.printf("Float.MAX_VALUE: %fn", Float.MAX_VALUE);

        // double
        double doubleNum = 3.1415926;
        System.out.printf("doubleNum: %fn", doubleNum);
        // double最小值
        System.out.printf("Double.MIN_VALUE: %fn", Double.MIN_VALUE);        
        // double最大值
        System.out.printf("Double.MAX_VALUE: %fn", Double.MAX_VALUE);

        // boolean
        boolean boolVal = true;
        System.out.printf("boolVal: %sn", boolVal);

        // char
        char char1 = 65;
        System.out.printf("char1: %sn", char1);
        char char2 = 'B';
        System.out.printf("char2: %sn", char2);
        char char3 = '\';
        System.out.printf("char3: %sn", char3);
        // char最小值
        System.out.printf("Character.MIN_VALUE: %dn", (int)Character.MIN_VALUE);
        // char最大值
        System.out.printf("Character.MAX_VALUE: %dn", (int)Character.MAX_VALUE);
    }
}
```
<!-- endfile -->

## 运行结果

<!-- run:main/primitive_type -->
```

$ javac main/primitive_type.java && java main/primitive_type
byteNum: 125
Byte.MIN_VALUE: -128
Byte.MAX_VALUE: 127
num2: 2019
Short.MIN_VALUE: -32768
Short.MAX_VALUE: 32767
num1: 20191001
Integer.MIN_VALUE: -2147483648
Integer.MAX_VALUE: 2147483647
Integer.MIN_VALUE - 1: 2147483647
Integer.MAX_VALUE + 1: -2147483648
longNum: 1234567890123456789
Long.MIN_VALUE: -9223372036854775808
Long.MAX_VALUE: 9223372036854775807
floatNum: 36.700001
Float.MIN_VALUE: 0.000000
Float.MAX_VALUE: 340282346638528860000000000000000000000.000000
doubleNum: 3.141593
Double.MIN_VALUE: 0.000000
Double.MAX_VALUE: 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.000000
boolVal: true
char1: A
char2: B
char3: 
Character.MIN_VALUE: 0
Character.MAX_VALUE: 65535

```
<!-- endrun -->