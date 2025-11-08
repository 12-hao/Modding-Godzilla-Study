/*    */ package com.jediterm.terminal;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface TerminalDataStream
/*    */ {
/*    */   char getChar() throws IOException;
/*    */   
/*    */   void pushChar(char paramChar) throws IOException;
/*    */   
/*    */   String readNonControlCharacters(int paramInt) throws IOException;
/*    */   
/*    */   void pushBackBuffer(char[] paramArrayOfchar, int paramInt) throws IOException;
/*    */   
/*    */   boolean isEmpty();
/*    */   
/*    */   public static class EOF
/*    */     extends IOException
/*    */   {
/*    */     public EOF() {
/* 26 */       super("EOF: There is no more data or connection is lost");
/*    */     }
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/jediterm/terminal/TerminalDataStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */