package org.step.third.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
public @interface OurPeople {

    String value() default "This is default message";
}
