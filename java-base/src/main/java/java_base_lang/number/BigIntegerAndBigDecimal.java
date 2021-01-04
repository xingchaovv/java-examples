package java_base_lang.number;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @example 大数值类 BigInteger 和 BigDecimal
 */
public class BigIntegerAndBigDecimal {

    public static void main(String[] args) {
        long maxLong = Long.MAX_VALUE;
        System.out.printf("maxLong: %s\n", maxLong);
        System.out.printf("2 x maxLong: %s\n", BigInteger.valueOf(maxLong).multiply(BigInteger.TWO));
        System.out.printf("128 x maxLong: %s\n", BigInteger.valueOf(maxLong).multiply(BigInteger.valueOf(128)));

        double maxDouble = Double.MAX_VALUE;
        System.out.printf("maxDouble: %s\n", maxDouble);
        System.out.printf("1.5 x maxDouble: %s\n", BigDecimal.valueOf(maxDouble).multiply(BigDecimal.valueOf(1.5)));

        System.out.printf("1.234 * 4.56: %s\n", 1.234 * 4.56);
        System.out.printf("1.234 x 4.56 by BigDecimal: %s\n", BigDecimal.valueOf(1.234).multiply(BigDecimal.valueOf(4.56)));

//        Out:
//        maxLong: 9223372036854775807
//        2 x maxLong: 18446744073709551614
//        128 x maxLong: 1180591620717411303296
//        maxDouble: 1.7976931348623157E308
//        1.5 x maxDouble: 2.69653970229347355E+308
//        1.234 * 4.56: 5.627039999999999
//        1.234 x 4.56 by BigDecimal: 5.62704
    }
}
