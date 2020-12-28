package java_base_io.stream;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

@Slf4j
public class Usage1 {

    public static void main(String[] args) throws IOException, URISyntaxException {
        log.info("{}", System.getProperty("user.dir"));

        String filePath = ClassLoader.getSystemClassLoader().getResource("java_base_io/stream/usage1/names.txt").toURI().getPath();
        FileInputStream fileInput = new FileInputStream(filePath);
        while (fileInput.available() > 0) {
            log.info("{}", fileInput.read());
        }
    }
}
