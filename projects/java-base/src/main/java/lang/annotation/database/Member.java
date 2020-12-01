package lang.annotation.database;

import lombok.Data;

@DBTable(name = "MEMBER")
@Data
public class Member {

    static int memberCount;

    @SQLString(30)
    String firstName;
    @SQLString(value = 50, name = "aaa")
    String lastName;
    @SQLInteger
    Integer age;
    @SQLString(value = 30, constraints = @Constraints(primaryKey = true))
    String handle;
}
