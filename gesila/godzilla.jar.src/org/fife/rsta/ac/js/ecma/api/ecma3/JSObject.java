package org.fife.rsta.ac.js.ecma.api.ecma3;

import org.fife.rsta.ac.js.ecma.api.ecma3.functions.JSObjectFunctions;

public abstract class JSObject implements JSObjectFunctions {
  public JSObject prototype;
  
  protected JSFunction constructor;
  
  public JSObject() {}
  
  public JSObject(JSObject value) {}
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/js/ecma/api/ecma3/JSObject.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */