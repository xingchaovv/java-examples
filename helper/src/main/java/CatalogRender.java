import entity.Project;

import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CatalogRender {

    private Project project;

    public CatalogRender(Project project) {
        this.project = project;
    }

    public String render() {
        StringBuilder sb = new StringBuilder();

        AtomicReference<Integer> exampleNum = new AtomicReference<>(0);
        project.getModules().forEach(module -> {
            sb.append(String.format(
                    "## %s\n\n", module.getName()
            ));
            module.getExamples().forEach(example -> {
                exampleNum.set(exampleNum.get() + 1);
                Path relativePath = project.getDir().toPath().relativize(example.getSourceFile().toPath());
                sb.append(String.format(
                        "%d. [%s](%s)\n\n", exampleNum.get(), example.getName(), relativePath
                ));
            });
        });

        return sb.toString();
    }
}
