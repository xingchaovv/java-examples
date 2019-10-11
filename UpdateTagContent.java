import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * UpdateTagContent
 * 用于更新文档内引入的标签，比如 file 标签用于直接显示程序文件内容，run 标签显示 Java 程序执行的结果。
 */
public class UpdateTagContent
{
    private File rootDir;

    private UpdateTagContent() throws IOException {
        rootDir = (new File("./")).getCanonicalFile();
    }

    private File[] listDocDirFiles() throws IOException {
        File docDir = (new File(rootDir.getCanonicalPath() + "/docs")).getCanonicalFile();
        return docDir.listFiles();
    }

    private boolean checkIsDocFile(File file) {
        String fileName = file.getName();
        return fileName.substring(fileName.lastIndexOf('.') + 1).equals("md");
    }

    public static void main(String[] args) throws IOException {
        UpdateTagContent updateIns = new UpdateTagContent();

        File[] files = updateIns.listDocDirFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {

            if (!updateIns.checkIsDocFile(file)) {
                System.out.println(file.getAbsolutePath());
                continue;
            }
            updateIns.updateOneFile(file);
        }
    }

    private void updateOneFile(File file) throws IOException {
        System.out.println(file.getAbsolutePath());
        String fileContent = Files.readString(Path.of(file.getCanonicalPath()));
        fileContent = parseTagFile(fileContent);
        fileContent = parseTagRun(fileContent);
        System.out.println(fileContent);
        // Files.writeString();
    }

    private String parseTagFile(String fileContent) throws IOException
    {
        // <!-- file:main/primitive_type.java -->
        // <!-- endfile -->
        String patternStr = "\\<\\!\\-\\-\\s*?file\\:(\\S+?.\\S+?)\\s*?\\-\\-\\>([\\s\\S]*?)<\\!\\-\\-\\s*?endfile\\s*?\\-\\-\\>";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(fileContent);
        StringBuffer newContent = new StringBuffer();
        while (matcher.find()) {
            String oldBlock = matcher.group(0);
            String relaFilePath = matcher.group(1);
            String oldTagContent = matcher.group(2);

            File file = (new File(rootDir.getCanonicalPath() + "/" + relaFilePath)).getCanonicalFile();
            String newTagContent = Files.readString(Path.of(file.getCanonicalPath()));
            newTagContent = String.format(
                "\n"
                + "源文件 [%s](%s)\n"
                + "```\n"
                + "%s\n"
                + "```\n",
                relaFilePath, relaFilePath, newTagContent
            );
            
            String newBlock = oldBlock.replace(oldTagContent, newTagContent);
            matcher.appendReplacement(newContent, newBlock);
        }
        matcher.appendTail(newContent);
        return newContent.toString();
    }
    
    private String parseTagRun(String fileContent) throws IOException
    {
        // <!-- run:main/primitive_type.java -->
        // <!-- endrun -->
        String patternStr = "\\<\\!\\-\\-\\s*?run\\:(\\S+?.\\S+?)\\s*?\\-\\-\\>([\\s\\S]*?)<\\!\\-\\-\\s*?endrun\\s*?\\-\\-\\>";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(fileContent);
        StringBuffer newContent = new StringBuffer();
        while (matcher.find()) {
            String oldBlock = matcher.group(0);
            String relaFilePath = matcher.group(1);
            String oldTagContent = matcher.group(2);

            File file = (new File(rootDir.getCanonicalPath() + "/" + relaFilePath)).getCanonicalFile();
            // @TODO
            String newTagContent = "result_for_" + relaFilePath;
            newTagContent = String.format(
                "\n"
                + "```\n"
                + "\\$ javac %s.java && java %s\n"
                + "%s\n"
                + "```\n",
                relaFilePath, relaFilePath, newTagContent
            );

            String newBlock = oldBlock.replace(oldTagContent, newTagContent);
            matcher.appendReplacement(newContent, newBlock);
        }
        matcher.appendTail(newContent);
        return newContent.toString();
    }
}
