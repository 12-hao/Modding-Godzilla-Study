/*    */ package com.kichik.pecoff4j.asm;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TEST
/*    */   extends AbstractInstruction
/*    */ {
/*    */   private ModRM modrm;
/*    */   
/*    */   public TEST(ModRM modrm) {
/* 16 */     this.modrm = modrm;
/* 17 */     this.code = toCode(133, modrm);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toIntelAssembly() {
/* 22 */     return "test " + Register.to32(this.modrm.reg1) + ", " + 
/* 23 */       Register.to32(this.modrm.reg2);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kichik/pecoff4j/asm/TEST.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */