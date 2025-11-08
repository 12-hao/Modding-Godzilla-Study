package org.fife.rsta.ac.js.ecma.api.ecma3.functions;

import org.fife.rsta.ac.js.ecma.api.ecma3.JSArray;
import org.fife.rsta.ac.js.ecma.api.ecma3.JSBoolean;

public interface JSRegExpFunctions extends JSObjectFunctions {
  JSArray exec(String paramString);
  
  JSBoolean test(String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/js/ecma/api/ecma3/functions/JSRegExpFunctions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */