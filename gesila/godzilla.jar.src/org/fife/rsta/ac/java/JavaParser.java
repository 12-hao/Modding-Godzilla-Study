/*     */ package org.fife.rsta.ac.java;
/*     */ 
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.beans.PropertyChangeSupport;
/*     */ import javax.swing.text.Element;
/*     */ import org.fife.io.DocumentReader;
/*     */ import org.fife.rsta.ac.java.rjc.ast.CompilationUnit;
/*     */ import org.fife.rsta.ac.java.rjc.lexer.Scanner;
/*     */ import org.fife.rsta.ac.java.rjc.notices.ParserNotice;
/*     */ import org.fife.rsta.ac.java.rjc.parser.ASTFactory;
/*     */ import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
/*     */ import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
/*     */ import org.fife.ui.rsyntaxtextarea.parser.AbstractParser;
/*     */ import org.fife.ui.rsyntaxtextarea.parser.DefaultParseResult;
/*     */ import org.fife.ui.rsyntaxtextarea.parser.DefaultParserNotice;
/*     */ import org.fife.ui.rsyntaxtextarea.parser.ParseResult;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JavaParser
/*     */   extends AbstractParser
/*     */ {
/*     */   public static final String PROPERTY_COMPILATION_UNIT = "CompilationUnit";
/*     */   private CompilationUnit cu;
/*  70 */   private PropertyChangeSupport support = new PropertyChangeSupport(this);
/*  71 */   private DefaultParseResult result = new DefaultParseResult(this);
/*     */ 
/*     */ 
/*     */   
/*     */   public JavaParser(RSyntaxTextArea textArea) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void addNotices(RSyntaxDocument doc) {
/*  80 */     this.result.clearNotices();
/*  81 */     int count = (this.cu == null) ? 0 : this.cu.getParserNoticeCount();
/*     */     
/*  83 */     if (count == 0) {
/*     */       return;
/*     */     }
/*     */     
/*  87 */     for (int i = 0; i < count; i++) {
/*  88 */       ParserNotice notice = this.cu.getParserNotice(i);
/*  89 */       int offs = getOffset(doc, notice);
/*  90 */       if (offs > -1) {
/*  91 */         int len = notice.getLength();
/*  92 */         this.result.addNotice(new DefaultParserNotice(this, notice
/*  93 */               .getMessage(), notice.getLine(), offs, len));
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void addPropertyChangeListener(String prop, PropertyChangeListener l) {
/* 101 */     this.support.addPropertyChangeListener(prop, l);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CompilationUnit getCompilationUnit() {
/* 113 */     return this.cu;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getOffset(RSyntaxDocument doc, ParserNotice notice) {
/* 118 */     Element root = doc.getDefaultRootElement();
/* 119 */     Element elem = root.getElement(notice.getLine());
/* 120 */     int offs = elem.getStartOffset() + notice.getColumn();
/* 121 */     return (offs >= elem.getEndOffset()) ? -1 : offs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ParseResult parse(RSyntaxDocument doc, String style) {
/* 131 */     this.cu = null;
/* 132 */     this.result.clearNotices();
/*     */     
/* 134 */     int lineCount = doc.getDefaultRootElement().getElementCount();
/* 135 */     this.result.setParsedLines(0, lineCount - 1);
/*     */     
/* 137 */     DocumentReader r = new DocumentReader(doc);
/* 138 */     Scanner scanner = new Scanner(r);
/* 139 */     scanner.setDocument(doc);
/* 140 */     ASTFactory fact = new ASTFactory();
/* 141 */     long start = System.currentTimeMillis();
/*     */     try {
/* 143 */       this.cu = fact.getCompilationUnit("SomeFile.java", scanner);
/* 144 */       long time = System.currentTimeMillis() - start;
/* 145 */       this.result.setParseTime(time);
/*     */     } finally {
/* 147 */       r.close();
/*     */     } 
/*     */     
/* 150 */     addNotices(doc);
/* 151 */     this.support.firePropertyChange("CompilationUnit", (Object)null, this.cu);
/* 152 */     return this.result;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removePropertyChangeListener(String prop, PropertyChangeListener l) {
/* 158 */     this.support.removePropertyChangeListener(prop, l);
/*     */   }
/*     */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/fife/rsta/ac/java/JavaParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */