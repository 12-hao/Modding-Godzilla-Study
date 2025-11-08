package com.google.common.eventbus;

import com.google.common.annotations.Beta;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Beta
public @interface AllowConcurrentEvents {}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/google/common/eventbus/AllowConcurrentEvents.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */