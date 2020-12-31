import entity.Project;
import java.io.IOException;
import entity.Module;

public class GenerateCatalog {

    public static void main(String[] args) throws IOException {
        Project project = new Project();
        project.addModule(new Module(project, "Java 基础", "java-base"));
        project.addModule(new Module(project, "Java 编译和工具", "javac-demo"));

        new ExampleFinder().findExamplesAndFill(project);

        new ReplaceHelper(
                project.getReadmeFile(),
                new CatalogRender(project).render()
        ).replace();
    }
}
