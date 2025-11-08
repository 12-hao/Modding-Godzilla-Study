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
/*    */ public class LwIntroFontProperty
/*    */   extends LwIntrospectedProperty
/*    */ {
/*    */   public LwIntroFontProperty(String name) {
/* 25 */     super(name, "java.awt.Font");
/*    */   }
/*    */   
/*    */   public Object read(Element element) throws Exception {
/* 29 */     return LwXmlReader.getFontDescriptor(element);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/lw/LwIntroFontProperty.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */