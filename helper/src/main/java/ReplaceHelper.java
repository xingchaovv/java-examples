import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceHelper {

    private static final String startTag = "<CatalogStartTag/>";
    private static final String endTag = "<CatalogEndTag/>";
    private File targetFile;
    private String newCatalog;

    public ReplaceHelper(File targetFile, String newCatalog) {
        this.targetFile = targetFile;
        this.newCatalog = newCatalog;
    }

    public void replace() throws IOException {
        String oldDocument = Files.readString(targetFile.toPath());
        String newCatalogBlock = startTag + "\n\n" + newCatalog + endTag;
        String regularStr = forLiteralVal(startTag) + "[\\s\\S]*?" + forLiteralVal(endTag);

        Matcher matcher = Pattern.compile(regularStr).matcher(oldDocument);
        StringBuilder newDocumentSB = new StringBuilder();
        if (matcher.find()) {
            matcher.appendReplacement(newDocumentSB, newCatalogBlock);
        }
        matcher.appendTail(newDocumentSB);

        Files.writeString(targetFile.toPath(), newDocumentSB.toString());
    }

    private String forLiteralVal(String str) {
        return str.replace("<", "\\<")
                .replace(">", "\\>");
    }
}
