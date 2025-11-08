/*    */ package com.intellij.uiDesigner.compiler;
/*    */ 
/*    */ import com.intellij.uiDesigner.lw.LwComponent;
/*    */ import com.intellij.uiDesigner.lw.LwIntrospectedProperty;
/*    */ import org.objectweb.asm.commons.GeneratorAdapter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class PropertyCodeGenerator
/*    */ {
/*    */   public abstract void generatePushValue(GeneratorAdapter paramGeneratorAdapter, Object paramObject);
/*    */   
/*    */   public boolean generateCustomSetValue(LwComponent lwComponent, Class componentClass, LwIntrospectedProperty property, GeneratorAdapter generator, int componentLocal, String formClassName) {
/* 17 */     return false;
/*    */   }
/*    */   
/*    */   public void generateClassStart(AsmCodeGenerator.FormClassVisitor visitor, String name, ClassLoader loader) {}
/*    */   
/*    */   public void generateClassEnd(AsmCodeGenerator.FormClassVisitor visitor) {}
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/intellij/uiDesigner/compiler/PropertyCodeGenerator.class
 * Java compiler version: 3 (47.0)
 * JD-Core Version:       1.1.3
 */