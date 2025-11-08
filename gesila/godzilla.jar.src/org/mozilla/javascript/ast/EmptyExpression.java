/*    */ package org.mozilla.javascript.ast;
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
/*    */ public class EmptyExpression
/*    */   extends AstNode
/*    */ {
/*    */   public EmptyExpression() {}
/*    */   
/*    */   public EmptyExpression(int pos) {
/* 26 */     super(pos);
/*    */   }
/*    */   
/*    */   public EmptyExpression(int pos, int len) {
/* 30 */     super(pos, len);
/*    */   }
/*    */ 
/*    */   
/*    */   public String toSource(int depth) {
/* 35 */     return makeIndent(depth);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void visit(NodeVisitor v) {
/* 43 */     v.visit(this);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/mozilla/javascript/ast/EmptyExpression.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */