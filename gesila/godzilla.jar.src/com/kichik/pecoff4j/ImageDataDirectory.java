/*    */ package com.kichik.pecoff4j;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ImageDataDirectory
/*    */ {
/*    */   private int virtualAddress;
/*    */   private int size;
/*    */   
/*    */   public int getVirtualAddress() {
/* 17 */     return this.virtualAddress;
/*    */   }
/*    */   
/*    */   public int getSize() {
/* 21 */     return this.size;
/*    */   }
/*    */   
/*    */   public void setVirtualAddress(int virtualAddress) {
/* 25 */     this.virtualAddress = virtualAddress;
/*    */   }
/*    */   
/*    */   public void setSize(int size) {
/* 29 */     this.size = size;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kichik/pecoff4j/ImageDataDirectory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */