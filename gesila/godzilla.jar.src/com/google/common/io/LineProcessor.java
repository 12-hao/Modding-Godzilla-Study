package com.google.common.io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

@Beta
@GwtIncompatible
public interface LineProcessor<T> {
  @CanIgnoreReturnValue
  boolean processLine(String paramString) throws IOException;
  
  T getResult();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/google/common/io/LineProcessor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */