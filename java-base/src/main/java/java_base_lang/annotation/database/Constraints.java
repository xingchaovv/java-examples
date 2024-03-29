package java_base_lang.annotation.database;

public @interface Constraints {

    boolean primaryKey() default false;
    boolean allowNull() default true;
    boolean unique() default false;
}
