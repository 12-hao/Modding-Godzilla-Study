/*    */ package com.kichik.pecoff4j.util;
/*    */ 
/*    */ import java.io.UnsupportedEncodingException;
/*    */ 
/*    */ public class Strings
/*    */ {
/*    */   public static int getUtf16Length(String string) {
/*    */     try {
/*  9 */       return (string.getBytes("UTF-16")).length + 2;
/* 10 */     } catch (UnsupportedEncodingException e) {
/* 11 */       return string.length() * 2 + 2;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kichik/pecoff4j/util/Strings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */