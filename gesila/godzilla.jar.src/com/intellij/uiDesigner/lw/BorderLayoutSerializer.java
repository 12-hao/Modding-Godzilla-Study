/*    */ package com.intellij.uiDesigner.lw;
/*    */ 
/*    */ import java.awt.BorderLayout;
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
/*    */ 
/*    */ 
/*    */ public class BorderLayoutSerializer
/*    */   extends LayoutSerializer
/*    */ {
/* 28 */   public static final BorderLayoutSerializer INSTANCE = new BorderLayoutSerializer();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   void readLayout(Element element, LwContainer container) {
/* 34 */     int hGap = LwXmlReader.getOptionalInt(element, "hgap", 0);
/* 35 */     int vGap = LwXmlReader.getOptionalInt(element, "vgap", 0);
/* 36 */     container.setLayout(new BorderLayout(hGap, vGap));
/*    */   }
/*    */   
/*    */   void readChildConstraints(Element constraintsElement, LwComponent component) {
/* 40 */     component.setCustomLayoutConstraints(LwXmlReader.getRequiredString(constraintsElement, "border-constraint"));
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/lw/BorderLayoutSerializer.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */