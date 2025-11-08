package org.sqlite;

public interface SQLiteCommitListener {
  void onCommit();
  
  void onRollback();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/sqlite/SQLiteCommitListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */