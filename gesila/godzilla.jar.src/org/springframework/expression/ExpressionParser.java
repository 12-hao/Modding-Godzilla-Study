package org.springframework.expression;

public interface ExpressionParser {
  Expression parseExpression(String paramString) throws ParseException;
  
  Expression parseExpression(String paramString, ParserContext paramParserContext) throws ParseException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/expression/ExpressionParser.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */