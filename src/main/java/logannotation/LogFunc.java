package logannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
public @interface LogFunc {
    int minArgs() default 0;

    int maxArgs() default 1;

    boolean showInHelp() default true;

    LogLevel level();
}
