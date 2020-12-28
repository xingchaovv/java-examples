package java_base_io.stream;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.URISyntaxException;

@Slf4j
public class BufferedReaderUsage1 {

    public static void main(String[] args) throws IOException, URISyntaxException {

        String filePath = ClassLoader.getSystemClassLoader().getResource("java_base_io/stream/usage1/names.txt").toURI().getPath();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            log.info("Line: {}", line);
        }
    }
}
