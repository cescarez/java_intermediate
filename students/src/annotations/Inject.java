package annotations;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

//this is the annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Inject {
    String value();
}