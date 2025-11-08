/*   */ package org.sqlite;
/*   */ 
/*   */ public interface SQLiteUpdateListener
/*   */ {
/*   */   void onUpdate(Type paramType, String paramString1, String paramString2, long paramLong);
/*   */   
/*   */   public enum Type
/*   */   {
/* 9 */     INSERT, DELETE, UPDATE;
/*   */   }
/*   */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/sqlite/SQLiteUpdateListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */