package org.springframework.core.io;

import org.springframework.lang.Nullable;

@FunctionalInterface
public interface ProtocolResolver {
  @Nullable
  Resource resolve(String paramString, ResourceLoader paramResourceLoader);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/core/io/ProtocolResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */