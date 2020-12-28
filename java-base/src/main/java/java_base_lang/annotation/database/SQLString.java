package java_base_lang.annotation.database;

public @interface SQLString {

    int value() default 0;
    String name() default "";
    Constraints constraints() default @Constraints;
}
