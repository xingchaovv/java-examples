package test1;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

class Test1
{
    public static void main(String[] args) {
        String originalInput = "a=b c+d;";
        String encodedString = URLEncoder.encode(originalInput, StandardCharsets.UTF_8);
        // encodedString: a%3Db+c%2Bd%3B
        System.out.printf("encodedString: %s\n", encodedString);
        String decodeString = URLDecoder.decode(encodedString, StandardCharsets.UTF_8);
        // decodeString: a=b c+d;
        System.out.printf("decodeString: %s\n", decodeString);
    }
}
