package core.imp;

import core.shell.ShellEntity;

public interface Cryption {
  void init(ShellEntity paramShellEntity);
  
  byte[] encode(byte[] paramArrayOfbyte);
  
  byte[] decode(byte[] paramArrayOfbyte);
  
  boolean isSendRLData();
  
  byte[] generate(String paramString1, String paramString2);
  
  boolean check();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/core/imp/Cryption.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */