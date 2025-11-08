/*    */ package javassist.runtime;
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
/*    */ public class DotClass
/*    */ {
/*    */   public static NoClassDefFoundError fail(ClassNotFoundException e) {
/* 27 */     return new NoClassDefFoundError(e.getMessage());
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/javassist/runtime/DotClass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */