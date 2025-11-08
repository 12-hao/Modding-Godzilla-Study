/*    */ package org.springframework.expression.spel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InternalParseException
/*    */   extends RuntimeException
/*    */ {
/*    */   public InternalParseException(SpelParseException cause) {
/* 30 */     super((Throwable)cause);
/*    */   }
/*    */ 
/*    */   
/*    */   public SpelParseException getCause() {
/* 35 */     return (SpelParseException)super.getCause();
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/expression/spel/InternalParseException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */