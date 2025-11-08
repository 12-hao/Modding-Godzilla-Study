/*    */ package com.kichik.pecoff4j.asm;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class POP
/*    */   extends AbstractInstruction
/*    */ {
/*    */   private int register;
/*    */   
/*    */   public POP(int register) {
/* 16 */     this.register = register;
/* 17 */     this.code = toCode(0x58 | register);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toIntelAssembly() {
/* 22 */     return "pop  " + Register.to32(this.register);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kichik/pecoff4j/asm/POP.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */