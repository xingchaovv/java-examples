package chao.chaoutil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class JvmUtil {

    public static class JarInfo {

        private long fileSize;
        private Date creationTime;
        private Date modifiedTime;

        public JarInfo(long fileSize, Date creationTime, Date modifiedTime) {
            this.fileSize = fileSize;
            this.creationTime = creationTime;
            this.modifiedTime = modifiedTime;
        }

        public long getFileSize() {
            return fileSize;
        }

        public Date getCreationTime() {
            return creationTime;
        }

        public Date getModifiedTime() {
            return modifiedTime;
        }

        @Override
        public String toString() {
            return "JarInfo{" +
                    "fileSize=" + fileSize +
                    ", creationTime=" + creationTime +
                    ", modifiedTime=" + modifiedTime +
                    '}';
        }
    }

    public static JarInfo getJarInfo(Class<?> classInJar) {
        URL classUrl = classInJar.getProtectionDomain().getCodeSource().getLocation();
        Path classPath;
        try {
            classPath = Paths.get(classUrl.toURI());
        } catch (URISyntaxException e) {
            return null;
        }

        if (!classPath.toString().endsWith(".jar")) {
            return null;
        }
        Path jarPath = classPath;

        BasicFileAttributes attrs;
        try {
            attrs = Files.readAttributes(jarPath, BasicFileAttributes.class);
        } catch (IOException ex) {
            return null;
        }

        return new JarInfo(
                attrs.size(),
                new Date(attrs.creationTime().toMillis()),
                new Date(attrs.lastModifiedTime().toMillis())
        );
    }

}
