package java_base_lang.operators.bitwise;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Usage1 {

    public static void main(String[] args) {
        int num1 = - 0b100;
        // 按位右移
        int num1r = num1 >> 2;
        // 无符号按位右移
        int num1rz = num1 >>> 2;
        log.info("num1: {}, num1r: {}, num1rz: {}", num1, num1r, num1rz);
        log.info("num1: {}", Integer.toBinaryString(num1));
        log.info("num1r: {}", Integer.toBinaryString(num1r));
        log.info("num1rz: {}", Integer.toBinaryString(num1rz));
    }
}
