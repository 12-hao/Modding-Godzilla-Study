package org.springframework.util;

import java.util.UUID;

@FunctionalInterface
public interface IdGenerator {
  UUID generateId();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/util/IdGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */