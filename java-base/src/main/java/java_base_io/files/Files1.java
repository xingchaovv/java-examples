package java_base_io.files;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Files1 {

    public static void main(String[] args) throws URISyntaxException, IOException {
        String filePath = ClassLoader.getSystemClassLoader().getResource("java_base_io/stream/usage1/names.txt").toURI().getPath();
        String content = new String(Files.readAllBytes(Path.of(filePath)), Charset.defaultCharset());
        System.out.print(content);
        String content2 = Files.readString(Path.of(filePath));
        System.out.print(content2);
    }
}
