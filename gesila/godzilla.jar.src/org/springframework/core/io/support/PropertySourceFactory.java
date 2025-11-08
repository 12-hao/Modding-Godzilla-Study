package org.springframework.core.io.support;

import java.io.IOException;
import org.springframework.core.env.PropertySource;
import org.springframework.lang.Nullable;

public interface PropertySourceFactory {
  PropertySource<?> createPropertySource(@Nullable String paramString, EncodedResource paramEncodedResource) throws IOException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/core/io/support/PropertySourceFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */