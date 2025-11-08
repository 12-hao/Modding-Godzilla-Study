/*    */ package org.springframework.core.annotation;
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
/*    */ 
/*    */ @FunctionalInterface
/*    */ public interface MergedAnnotationSelector<A extends java.lang.annotation.Annotation>
/*    */ {
/*    */   default boolean isBestCandidate(MergedAnnotation<A> annotation) {
/* 40 */     return false;
/*    */   }
/*    */   
/*    */   MergedAnnotation<A> select(MergedAnnotation<A> paramMergedAnnotation1, MergedAnnotation<A> paramMergedAnnotation2);
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/core/annotation/MergedAnnotationSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */