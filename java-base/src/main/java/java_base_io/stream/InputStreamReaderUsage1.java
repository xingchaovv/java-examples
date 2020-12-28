package java_base_io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderUsage1 {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader1 = new InputStreamReader(System.in);
        System.out.println(reader1.read());
    }
}
