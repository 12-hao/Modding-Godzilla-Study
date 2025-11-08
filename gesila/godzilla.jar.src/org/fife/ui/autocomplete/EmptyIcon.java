/*    */ package org.fife.ui.autocomplete;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.Graphics;
/*    */ import java.io.Serializable;
/*    */ import javax.swing.Icon;
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
/*    */ public class EmptyIcon
/*    */   implements Icon, Serializable
/*    */ {
/*    */   private int size;
/*    */   
/*    */   public EmptyIcon(int size) {
/* 31 */     this.size = size;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIconHeight() {
/* 37 */     return this.size;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIconWidth() {
/* 43 */     return this.size;
/*    */   }
/*    */   
/*    */   public void paintIcon(Component c, Graphics g, int x, int y) {}
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/autocomplete/EmptyIcon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */