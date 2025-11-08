package javassist;

import java.io.InputStream;
import java.net.URL;

public interface ClassPath {
  InputStream openClassfile(String paramString) throws NotFoundException;
  
  URL find(String paramString);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/javassist/ClassPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */