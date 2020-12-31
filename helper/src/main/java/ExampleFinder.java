import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import entity.Example;
import entity.Project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import entity.Module;

public class ExampleFinder {

    public void findExamplesAndFill(Project project) {
        project.getModules().forEach(module -> {
            processForOneFolder(module, module.getDir());
        });
    }

    private void processForOneFolder(Module targetModule, File searchDir) {
        Arrays.stream(searchDir.listFiles()).forEach((dirOrFile) -> {
            if (dirOrFile.isFile() && dirOrFile.getName().endsWith(".java")) {
                Example example = null;
                example = parseOneExample(targetModule, dirOrFile);
                if (example != null) {
                    targetModule.addExample(example);
                }
            } else if (dirOrFile.isDirectory()) {
                processForOneFolder(targetModule, dirOrFile);
            }
        });
    }

    private Example parseOneExample(Module targetModule, File javaFile) {
        Example[] examples = new Example[1];
        CompilationUnit unit = null;
        try {
            unit = StaticJavaParser.parse(javaFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        unit.getPrimaryType().ifPresent((classNode) -> {
            classNode.getJavadocComment().ifPresent((comment) -> {
                comment.parse().getBlockTags().forEach((tag) -> {
                    if (tag.getTagName().equals("example")) {
                        String exampleVal = tag.getContent().toText();
                        if (!exampleVal.isBlank()) {
                            exampleVal = exampleVal.split("\n", 2)[0];
                            examples[0] = new Example(targetModule, exampleVal, javaFile);
                        }
                    }
                });
            });
        });
        return examples[0];
    }
}
