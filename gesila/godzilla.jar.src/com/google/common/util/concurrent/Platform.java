/*    */ package com.google.common.util.concurrent;
/*    */ 
/*    */ import com.google.common.annotations.GwtCompatible;
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
/*    */ @GwtCompatible(emulated = true)
/*    */ final class Platform
/*    */ {
/*    */   static boolean isInstanceOfThrowableClass(Throwable t, Class<? extends Throwable> expectedClass) {
/* 25 */     return expectedClass.isInstance(t);
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/google/common/util/concurrent/Platform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */