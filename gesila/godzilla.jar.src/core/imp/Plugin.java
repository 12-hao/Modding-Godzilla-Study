package core.imp;

import core.shell.ShellEntity;
import javax.swing.JPanel;

public interface Plugin {
  void init(ShellEntity paramShellEntity);
  
  JPanel getView();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/core/imp/Plugin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */