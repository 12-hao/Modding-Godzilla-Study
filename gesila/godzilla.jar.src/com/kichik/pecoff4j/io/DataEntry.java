/*    */ package com.kichik.pecoff4j.io;
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
/*    */ public class DataEntry
/*    */ {
/*    */   public boolean isSection;
/*    */   public int index;
/*    */   public int pointer;
/*    */   public boolean isDebugRawData;
/*    */   public int baseAddress;
/*    */   
/*    */   public DataEntry() {}
/*    */   
/*    */   public DataEntry(int index, int pointer) {
/* 23 */     this.index = index;
/* 24 */     this.pointer = pointer;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kichik/pecoff4j/io/DataEntry.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */