package org.yaml.snakeyaml.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface YamlComment {
  String Comment();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/yaml/snakeyaml/annotation/YamlComment.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */