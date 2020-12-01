package lang.annotation.database;

public @interface SQLInteger {

    String name() default "";
    Constraints constraints() default @Constraints;
}
