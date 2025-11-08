/*    */ package org.fife.ui.rsyntaxtextarea;
/*    */ 
/*    */ import javax.swing.text.Segment;
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
/*    */ 
/*    */ 
/*    */ public abstract class AbstractJFlexTokenMaker
/*    */   extends TokenMakerBase
/*    */ {
/*    */   protected Segment s;
/*    */   protected int start;
/*    */   protected int offsetShift;
/*    */   
/*    */   public abstract void yybegin(int paramInt);
/*    */   
/*    */   protected void yybegin(int state, int languageIndex) {
/* 47 */     yybegin(state);
/* 48 */     setLanguageIndex(languageIndex);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/AbstractJFlexTokenMaker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */