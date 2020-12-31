package entity;

import entity.Example;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Data
public class Module {

    private Project project;
    private String name;
    private String slug;
    private File dir;
    private List<Example> examples = new ArrayList<>();

    public Module(Project project, String name, String slug) {
        this.project = project;
        this.name = name;
        this.slug = slug;
        dir = Paths.get(project.getDir().getPath(), this.slug).toFile();
    }

    public void addExample(Example example) {
        examples.add(example);
    }
}
