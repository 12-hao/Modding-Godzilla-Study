/*    */ package com.intellij.uiDesigner.lw;
/*    */ 
/*    */ import org.jdom.Element;
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
/*    */ public final class LwIntroInsetsProperty
/*    */   extends LwIntrospectedProperty
/*    */ {
/*    */   public LwIntroInsetsProperty(String name) {
/* 25 */     super(name, "java.awt.Insets");
/*    */   }
/*    */   
/*    */   public Object read(Element element) throws Exception {
/* 29 */     return LwXmlReader.readInsets(element);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/lw/LwIntroInsetsProperty.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */