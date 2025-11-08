/*    */ package javassist.scopedpool;
/*    */ 
/*    */ import javassist.ClassPool;
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
/*    */ public class ScopedClassPoolFactoryImpl
/*    */   implements ScopedClassPoolFactory
/*    */ {
/*    */   public ScopedClassPool create(ClassLoader cl, ClassPool src, ScopedClassPoolRepository repository) {
/* 33 */     return new ScopedClassPool(cl, src, repository, false);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ScopedClassPool create(ClassPool src, ScopedClassPoolRepository repository) {
/* 41 */     return new ScopedClassPool(null, src, repository, true);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/javassist/scopedpool/ScopedClassPoolFactoryImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */