package validation.validationapi.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
public class User {

    @NotEmpty
    private String name;

    @Positive
    private Integer age;

    @Email
    private String email;
}
