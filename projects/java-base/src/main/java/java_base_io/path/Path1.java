package java_base_io.path;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.lang.System.out;

public class Path1 {

    public static void main(String[] args) throws URISyntaxException {
        String dirPath = ClassLoader.getSystemClassLoader().getResource("java_base_io/stream/usage1").toURI().getPath();
        Path p1 = Paths.get(dirPath);
        out.println("p1：" + p1);
        out.println("getParent：" + p1.getParent());
    }
}
