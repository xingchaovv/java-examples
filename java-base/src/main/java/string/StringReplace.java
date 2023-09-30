package string;

public class StringReplace {

    public static void main(String[] args) {
        String str1 = "aaa${bbb}ccc";
        System.out.println(str1.replace("${bbb}", "1"));
    }
}
