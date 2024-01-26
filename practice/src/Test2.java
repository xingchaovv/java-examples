import java.io.UnsupportedEncodingException;

public class Test2 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = new String("投");
        // String str = new String(s.getBytes("iso-8859-1"), "utf-8");
        String str = new String(s.getBytes("utf-8"), "iso-8859-1");
        System.out.println(str);
        for (byte aByte : str.getBytes()) {
            System.out.println(String.format("%02X", aByte));
        }
    }
}
