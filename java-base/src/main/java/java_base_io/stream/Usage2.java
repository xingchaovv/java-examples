package java_base_io.stream;

import lombok.extern.slf4j.Slf4j;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

@Slf4j
public class Usage2 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        String filePath = ClassLoader.getSystemClassLoader().getResource("java_base_io/stream/usage1/names.txt").toURI().getPath();
        FileInputStream fileIn = new FileInputStream(filePath);

        DataInputStream dateIn = new DataInputStream(fileIn);
        log.info("double:{}", dateIn.readChar());
    }
}
