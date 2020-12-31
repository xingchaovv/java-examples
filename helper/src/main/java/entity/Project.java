package entity;

import lombok.Data;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Data
public class Project {

    File dir;
    List<Module> modules = new ArrayList<>();

    {
        try {
            dir = (new File("./")).getCanonicalFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public File getReadmeFile() throws IOException {
        return Path.of(dir.toPath() + "/README.md").toFile().getCanonicalFile();
    }
}
