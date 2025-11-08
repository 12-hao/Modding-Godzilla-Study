/*    */ package com.kitfox.svg.pathcmd;
/*    */ 
/*    */ import java.awt.geom.GeneralPath;
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
/*    */ 
/*    */ 
/*    */ public abstract class PathCommand
/*    */ {
/*    */   public boolean isRelative = false;
/*    */   
/*    */   public PathCommand() {}
/*    */   
/*    */   public PathCommand(boolean isRelative) {
/* 58 */     this.isRelative = isRelative;
/*    */   }
/*    */   
/*    */   public abstract void appendPath(GeneralPath paramGeneralPath, BuildHistory paramBuildHistory);
/*    */   
/*    */   public abstract int getNumKnotsAdded();
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kitfox/svg/pathcmd/PathCommand.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */