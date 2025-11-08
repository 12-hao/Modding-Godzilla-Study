package org.springframework.lang;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Documented
public @interface UsesSunHttpServer {}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/lang/UsesSunHttpServer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */