package core.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CryptionAnnotation {
  String payloadName();
  
  String Name();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/core/annotation/CryptionAnnotation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */