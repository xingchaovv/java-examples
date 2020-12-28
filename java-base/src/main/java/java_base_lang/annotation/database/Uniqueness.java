package java_base_lang.annotation.database;

public @interface Uniqueness {

    Constraints constraints() default @Constraints(unique = true);
}
