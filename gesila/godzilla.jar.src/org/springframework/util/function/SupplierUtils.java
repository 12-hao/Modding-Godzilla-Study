/*    */ package org.springframework.util.function;
/*    */ 
/*    */ import java.util.function.Supplier;
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
/*    */ 
/*    */ 
/*    */ public abstract class SupplierUtils
/*    */ {
/*    */   @Nullable
/*    */   public static <T> T resolve(@Nullable Supplier<T> supplier) {
/* 40 */     return (supplier != null) ? supplier.get() : null;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/util/function/SupplierUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */