package org.fife.rsta.ac.js.ecma.api.dom;

import org.fife.rsta.ac.js.ecma.api.ecma3.JSFunction;
import org.fife.rsta.ac.js.ecma.api.ecma5.functions.JS5ObjectFunctions;
import org.w3c.dom.NodeList;

public abstract class JSNodeList implements NodeList, JS5ObjectFunctions {
  public JSNodeList protype;
  
  protected JSFunction constructor;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/js/ecma/api/dom/JSNodeList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */