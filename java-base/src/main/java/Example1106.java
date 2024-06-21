import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 获取当前 Class 文件信息、所在 Jar 信息
 */
public class Example1106 {

    public static void main(String[] args) throws IOException {
        Example1106 example1106 = new Example1106();
        example1106.test();
    }

    private void test() {
        try {
            // 获取当前类的 URL
            URL classUrl = this.getClass().getProtectionDomain().getCodeSource().getLocation();

            // 将 URL 转换为路径
            Path classPath = Paths.get(classUrl.toURI());

            // 打印路径
            System.out.println("Class file path: " + classPath);

            // 判断路径是否指向 JAR 文件
            if (classPath.toString().endsWith(".jar")) {
                System.out.println("The class is located in the JAR file: " + classPath);

                Path jarPath = classPath;
                // 获取文件属性
                BasicFileAttributes attrs = Files.readAttributes(jarPath, BasicFileAttributes.class);

                // 打印文件大小和创建时间
                System.out.println("File size: " + attrs.size() + " bytes");
                // 获取创建时间并转换为当前时区
                Instant creationInstant = attrs.creationTime().toInstant();
                LocalDateTime creationDateTime = LocalDateTime.ofInstant(creationInstant, ZoneId.systemDefault());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                // 打印创建时间（当前时区）
                System.out.println("Creation time: " + creationDateTime.format(formatter));
                // 获取创建时间并转换为当前时区
                Instant modifyInstant = attrs.lastModifiedTime().toInstant();
                LocalDateTime modifyDateTime = LocalDateTime.ofInstant(modifyInstant, ZoneId.systemDefault());
                // 打印创建时间（当前时区）
                System.out.println("Modify time: " + modifyDateTime.format(formatter));
            } else {
                System.out.println("The class is not located in a JAR file.");
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

/* 测试方法

% java -cp java-base-1.0-SNAPSHOT.jar Example1106
Class file path: /Users/chao/projects/java_projects/java-examples/java-base/target/java-base-1.0-SNAPSHOT.jar
The class is located in the JAR file: /Users/chao/projects/java_projects/java-examples/java-base/target/java-base-1.0-SNAPSHOT.jar

*/

    }
}


