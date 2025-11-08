/*    */ package org.fife.ui.rsyntaxtextarea.modes;
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
/*    */ public class LessTokenMaker
/*    */   extends CSSTokenMaker
/*    */ {
/*    */   public LessTokenMaker() {
/* 29 */     setHighlightingLess(true);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String[] getLineCommentStartAndEnd(int languageIndex) {
/* 38 */     return new String[] { "//", null };
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean getMarkOccurrencesOfTokenType(int type) {
/* 47 */     return (type == 17 || super
/* 48 */       .getMarkOccurrencesOfTokenType(type));
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/modes/LessTokenMaker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */