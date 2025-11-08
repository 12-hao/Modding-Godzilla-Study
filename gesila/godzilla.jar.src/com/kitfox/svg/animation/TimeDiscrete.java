/*    */ package com.kitfox.svg.animation;
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
/*    */ public class TimeDiscrete
/*    */   extends TimeBase
/*    */ {
/*    */   double secs;
/*    */   
/*    */   public TimeDiscrete(double secs) {
/* 53 */     this.secs = secs;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public double evalTime() {
/* 59 */     return this.secs;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kitfox/svg/animation/TimeDiscrete.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */