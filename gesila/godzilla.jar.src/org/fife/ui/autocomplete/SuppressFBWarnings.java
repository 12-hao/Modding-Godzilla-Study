package org.fife.ui.autocomplete;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface SuppressFBWarnings {
  String[] value() default {};
  
  String justification() default "";
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/autocomplete/SuppressFBWarnings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */