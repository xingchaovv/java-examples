package chao.chaoframe.util;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;
import java.util.Map;

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
        try {
            // Test URL
            // classUrl = new URL("jar:file:/E:/xxx/xxx-1.0-SNAPSHOT.jar!/BOOT-INF/classes!/");

            URL classUrl = classInJar.getProtectionDomain().getCodeSource().getLocation();
            String spec = classUrl.getFile();
            int separatorIndex = spec.indexOf("!/");
            if (separatorIndex == -1) {
                return null;
            }
            String fileUriString = spec.substring(0, separatorIndex);
            if (!fileUriString.startsWith("file:")) {
                return null;
            }
            URI fileUri = URI.create(fileUriString);

            BasicFileAttributes attrs;
            try {
                attrs = Files.readAttributes(Paths.get(fileUri), BasicFileAttributes.class);
            } catch (IOException ex) {
                return null;
            }

            return new JarInfo(
                    attrs.size(),
                    new Date(attrs.creationTime().toMillis()),
                    new Date(attrs.lastModifiedTime().toMillis())
            );
        } catch (RuntimeException e) {
            return null;
        }
    }

}