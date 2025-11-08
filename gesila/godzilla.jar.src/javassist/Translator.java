package javassist;

public interface Translator {
  void start(ClassPool paramClassPool) throws NotFoundException, CannotCompileException;
  
  void onLoad(ClassPool paramClassPool, String paramString) throws NotFoundException, CannotCompileException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/javassist/Translator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */