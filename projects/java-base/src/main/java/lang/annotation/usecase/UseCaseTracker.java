package lang.annotation.usecase;

import java.util.Arrays;

public class UseCaseTracker {

    public static void main(String[] args) {
        trackUseCases(PasswordUtils.class);
    }

    public static void trackUseCases(Class<?> cl) {
        Arrays.asList(cl.getDeclaredMethods()).forEach(method -> {
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("Found UseCase: " + useCase.id() + " " + useCase.description());
            }
        });
    }
}
