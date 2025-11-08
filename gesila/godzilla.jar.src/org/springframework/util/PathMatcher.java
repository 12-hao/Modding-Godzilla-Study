package org.springframework.util;

import java.util.Comparator;
import java.util.Map;

public interface PathMatcher {
  boolean isPattern(String paramString);
  
  boolean match(String paramString1, String paramString2);
  
  boolean matchStart(String paramString1, String paramString2);
  
  String extractPathWithinPattern(String paramString1, String paramString2);
  
  Map<String, String> extractUriTemplateVariables(String paramString1, String paramString2);
  
  Comparator<String> getPatternComparator(String paramString);
  
  String combine(String paramString1, String paramString2);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/util/PathMatcher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */