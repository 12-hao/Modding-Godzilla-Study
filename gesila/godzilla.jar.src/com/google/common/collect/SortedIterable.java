package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;

@GwtCompatible
interface SortedIterable<T> extends Iterable<T> {
  Comparator<? super T> comparator();
  
  Iterator<T> iterator();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/google/common/collect/SortedIterable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */