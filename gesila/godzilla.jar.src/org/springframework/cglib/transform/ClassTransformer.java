/*    */ package org.springframework.cglib.transform;
/*    */ 
/*    */ import org.springframework.asm.ClassVisitor;
/*    */ import org.springframework.cglib.core.Constants;
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
/*    */ public abstract class ClassTransformer
/*    */   extends ClassVisitor
/*    */ {
/*    */   public ClassTransformer() {
/* 23 */     super(Constants.ASM_API);
/*    */   }
/*    */   public ClassTransformer(int opcode) {
/* 26 */     super(opcode);
/*    */   }
/*    */   
/*    */   public abstract void setTarget(ClassVisitor paramClassVisitor);
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/cglib/transform/ClassTransformer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */