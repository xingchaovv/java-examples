package java_base_io;

import java.io.File;
import java.util.Arrays;

public class File1 {

    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(File.separator);

        File file1 = new File("/Users/chao/.gitconfig");
        System.out.println(file1.exists());
        System.out.println(file1.getName());
        System.out.println(file1.isDirectory());
        System.out.println(file1.length());
        System.out.println(file1.getParent());

        File homeDir = new File("/Users/chao");
        Arrays.stream(homeDir.listFiles()).forEach(e -> {
            System.out.printf("Sub File: %s\n", e);
        });
    }
}
