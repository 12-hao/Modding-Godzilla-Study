/*    */ package org.fife.ui.rsyntaxtextarea;
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
/*    */ public abstract class AbstractTokenMaker
/*    */   extends TokenMakerBase
/*    */ {
/* 38 */   protected TokenMap wordsToHighlight = getWordsToHighlight();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public abstract TokenMap getWordsToHighlight();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void removeLastToken() {
/* 57 */     if (this.previousToken == null) {
/* 58 */       this.firstToken = this.currentToken = null;
/*    */     } else {
/*    */       
/* 61 */       this.currentToken = this.previousToken;
/* 62 */       this.currentToken.setNextToken(null);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/ui/rsyntaxtextarea/AbstractTokenMaker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */