package org.fife.rsta.ac.js.ecma.api.client;

import org.fife.rsta.ac.js.ecma.api.client.funtions.LocationFunctions;
import org.fife.rsta.ac.js.ecma.api.ecma3.JSFunction;
import org.fife.rsta.ac.js.ecma.api.ecma3.JSString;

public abstract class Location implements LocationFunctions {
  protected JSFunction constructor;
  
  public Location prototype;
  
  public Location location;
  
  public JSString hash;
  
  public JSString host;
  
  public JSString hostname;
  
  public JSString href;
  
  public JSString pathname;
  
  public JSString port;
  
  public JSString protocol;
  
  public JSString search;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/js/ecma/api/client/Location.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */