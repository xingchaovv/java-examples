package java_base_io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

public class InputStreamReaderUsage2 {

    public static void main(String[] args) throws IOException, URISyntaxException {

        String filePath = ClassLoader.getSystemClassLoader().getResource("java_base_io/stream/usage1/names.txt").toURI().getPath();
        InputStreamReader reader2 = new InputStreamReader(new FileInputStream(filePath));
        while (true) {
            int chVal = reader2.read();
            if (chVal == -1) {
                break;
            }
            System.out.print((char)chVal);
        }
        System.out.println("123");
        System.out.write(49);
        System.out.println("456");
    }
}
