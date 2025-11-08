package org.apache.log4j.spi;

import org.apache.log4j.Appender;
import org.apache.log4j.Category;

public interface HierarchyEventListener {
  void addAppenderEvent(Category paramCategory, Appender paramAppender);
  
  void removeAppenderEvent(Category paramCategory, Appender paramAppender);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/apache/log4j/spi/HierarchyEventListener.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */