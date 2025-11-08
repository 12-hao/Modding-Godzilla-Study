package javassist.util.proxy;

import java.lang.reflect.Method;

public interface MethodFilter {
  boolean isHandled(Method paramMethod);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/javassist/util/proxy/MethodFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */