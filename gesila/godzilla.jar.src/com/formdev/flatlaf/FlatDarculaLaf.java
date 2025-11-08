/*    */ package com.formdev.flatlaf;
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
/*    */ public class FlatDarculaLaf
/*    */   extends FlatDarkLaf
/*    */ {
/*    */   public static final String NAME = "FlatLaf Darcula";
/*    */   
/*    */   public static boolean install() {
/* 33 */     return install(new FlatDarculaLaf());
/*    */   }
/*    */   
/*    */   public static void installLafInfo() {
/* 37 */     installLafInfo("FlatLaf Darcula", (Class)FlatDarculaLaf.class);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getName() {
/* 42 */     return "FlatLaf Darcula";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getDescription() {
/* 47 */     return "FlatLaf Darcula Look and Feel";
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/formdev/flatlaf/FlatDarculaLaf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */