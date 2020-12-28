package java_base_nio.charset;

import java.nio.charset.Charset;

public class Charset1 {

    public static void main(String[] args) {
        Charset c1 = Charset.forName("ASCII");
        System.out.println("a in ASCII: " + c1.encode("a").get());
        System.out.println("b in ASCII: " + c1.encode("b").get());

        Charset c2 = Charset.forName("UTF-8");
        System.out.println("a in UTF8：" + c2.encode("a").get());
        System.out.println("b in UTF8：" + c2.encode("b").get());

        Charset c3 = Charset.forName("UTF-16");
        System.out.println("a in UTF-16：" + c3.encode("a").get());
        System.out.println("b in UTF-16：" + c3.encode("b").get());

        Charset c4 = Charset.forName("UTF-16BE");
        System.out.println("a in UTF-16BE：" + c4.encode("a").get());
        System.out.println("b in UTF-16BE：" + c4.encode("b").get());

        Charset c5 = Charset.forName("UTF-16LE");
        System.out.println("a in UTF-16LE：" + c5.encode("a").get());
        System.out.println("b in UTF-16LE：" + c5.encode("b").get());
    }
}
