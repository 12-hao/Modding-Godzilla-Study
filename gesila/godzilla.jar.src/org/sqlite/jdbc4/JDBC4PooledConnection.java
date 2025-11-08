package org.sqlite.jdbc4;

import javax.sql.PooledConnection;
import javax.sql.StatementEventListener;

public abstract class JDBC4PooledConnection implements PooledConnection {
  public void addStatementEventListener(StatementEventListener listener) {}
  
  public void removeStatementEventListener(StatementEventListener listener) {}
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/sqlite/jdbc4/JDBC4PooledConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */