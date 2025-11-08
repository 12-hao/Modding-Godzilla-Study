package com.kitfox.svg;

import java.awt.Paint;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public abstract class FillElement extends SVGElement {
  public abstract Paint getPaint(Rectangle2D paramRectangle2D, AffineTransform paramAffineTransform);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/com/kitfox/svg/FillElement.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */