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
/*    */ 
/*    */ public class LwIntroIconProperty
/*    */   extends LwIntrospectedProperty
/*    */ {
/*    */   public LwIntroIconProperty(String name) {
/* 26 */     super(name, "javax.swing.Icon");
/*    */   }
/*    */   
/*    */   public Object read(Element element) throws Exception {
/* 30 */     String value = LwXmlReader.getRequiredString(element, "value");
/* 31 */     return new IconDescriptor(value);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/lw/LwIntroIconProperty.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */