/*    */ package org.springframework.core.env;
/*    */ 
/*    */ import java.util.stream.Stream;
/*    */ import java.util.stream.StreamSupport;
/*    */ import org.springframework.lang.Nullable;
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
/*    */ public interface PropertySources
/*    */   extends Iterable<PropertySource<?>>
/*    */ {
/*    */   default Stream<PropertySource<?>> stream() {
/* 39 */     return StreamSupport.stream(spliterator(), false);
/*    */   }
/*    */   
/*    */   boolean contains(String paramString);
/*    */   
/*    */   @Nullable
/*    */   PropertySource<?> get(String paramString);
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/core/env/PropertySources.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */