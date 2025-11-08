/*    */ package javassist;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ final class ClassPathList
/*    */ {
/*    */   ClassPathList next;
/*    */   ClassPath path;
/*    */   
/*    */   ClassPathList(ClassPath p, ClassPathList n) {
/* 39 */     this.next = n;
/* 40 */     this.path = p;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/javassist/ClassPathList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */