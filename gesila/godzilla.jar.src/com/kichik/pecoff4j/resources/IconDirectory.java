/*    */ package com.kichik.pecoff4j.resources;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class IconDirectory
/*    */ {
/*    */   private int reserved;
/*    */   private int type;
/* 17 */   private ArrayList entries = new ArrayList();
/*    */   
/*    */   public void add(IconDirectoryEntry entry) {
/* 20 */     this.entries.add(entry);
/*    */   }
/*    */   
/*    */   public int getCount() {
/* 24 */     return this.entries.size();
/*    */   }
/*    */   
/*    */   public IconDirectoryEntry getEntry(int index) {
/* 28 */     return this.entries.get(index);
/*    */   }
/*    */   
/*    */   public void setReserved(int reserved) {
/* 32 */     this.reserved = reserved;
/*    */   }
/*    */   
/*    */   public void setType(int type) {
/* 36 */     this.type = type;
/*    */   }
/*    */   
/*    */   public int getReserved() {
/* 40 */     return this.reserved;
/*    */   }
/*    */   
/*    */   public int getType() {
/* 44 */     return this.type;
/*    */   }
/*    */   
/*    */   public int sizeOf() {
/* 48 */     return 6 + this.entries.size() * IconDirectoryEntry.sizeOf();
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kichik/pecoff4j/resources/IconDirectory.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */