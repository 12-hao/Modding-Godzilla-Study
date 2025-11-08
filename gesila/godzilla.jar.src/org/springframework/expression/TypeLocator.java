package org.springframework.expression;

@FunctionalInterface
public interface TypeLocator {
  Class<?> findType(String paramString) throws EvaluationException;
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/springframework/expression/TypeLocator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */