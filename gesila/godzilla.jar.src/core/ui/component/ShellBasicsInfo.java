/*    */ package core.ui.component;
/*    */ 
/*    */ import core.annotation.DisplayName;
/*    */ import core.shell.ShellEntity;
/*    */ import java.awt.BorderLayout;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JScrollPane;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DisplayName(DisplayName = "基础信息")
/*    */ public class ShellBasicsInfo
/*    */   extends JPanel
/*    */ {
/*    */   private final ShellEntity shellEntity;
/*    */   private final RTextArea basicsInfoTextArea;
/*    */   
/*    */   public ShellBasicsInfo(ShellEntity shellEntity) {
/* 20 */     this.shellEntity = shellEntity;
/* 21 */     setLayout(new BorderLayout(1, 1));
/* 22 */     this.basicsInfoTextArea = new RTextArea();
/* 23 */     this.basicsInfoTextArea.setEditable(false);
/* 24 */     add(new JScrollPane(this.basicsInfoTextArea));
/* 25 */     this.basicsInfoTextArea.setText(shellEntity.getPayloadModule().getBasicsInfo());
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/core/ui/component/ShellBasicsInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */