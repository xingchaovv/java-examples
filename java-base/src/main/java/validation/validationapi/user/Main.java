package validation.validationapi.user;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User zhang = new User("zhang", -5, "zhang@111.com");
        User xing = new User("xing", 20, "xing@.com");

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<User>> violations;

        violations = validator.validate(zhang);
        printViolations(violations);
        violations = validator.validate(xing);
        printViolations(violations);
    }

    private static <T> void printViolations(Set<ConstraintViolation<T>> violations) {
        violations.forEach(violation -> {
            System.out.printf("%s: %s\n", violation.getPropertyPath(), violation.getMessage());
        });
    }
}
