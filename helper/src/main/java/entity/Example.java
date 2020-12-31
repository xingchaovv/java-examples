package entity;

import lombok.Data;
import java.io.File;

@Data
public class Example {
    private Module module;
    private String name;
    private File sourceFile;

    public Example(Module module, String name, File sourceFile) {
        this.module = module;
        this.name = name;
        this.sourceFile = sourceFile;
    }
}
