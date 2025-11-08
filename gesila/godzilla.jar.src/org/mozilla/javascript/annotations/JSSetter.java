package org.mozilla.javascript.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface JSSetter {
  String value() default "";
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/mozilla/javascript/annotations/JSSetter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */