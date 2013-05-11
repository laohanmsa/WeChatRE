package com.tencent.mm.ui.setting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.mm.platformtools.bf;

class NetStatRuler extends View
{
  public NetStatRuler(Context paramContext)
  {
    this(paramContext, null);
  }

  public NetStatRuler(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public NetStatRuler(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    TextPaint localTextPaint = new TextPaint();
    localTextPaint.setAntiAlias(true);
    localTextPaint.setDither(true);
    Rect localRect = new Rect();
    getDrawingRect(localRect);
    float f1 = localRect.height();
    float f2 = localRect.left + getPaddingLeft();
    float f3 = localRect.top + f1 / 3.0F;
    float f4 = localRect.top + 2.0F * f1 / 3.0F;
    float f5 = f1 + localRect.top;
    localTextPaint.setColor(-7829368);
    paramCanvas.drawText(bf.z(2 * NetStatUnit.max / 3), f2, f3, localTextPaint);
    paramCanvas.drawText(bf.z(NetStatUnit.max / 3), f2, f4, localTextPaint);
    paramCanvas.drawText(bf.z(0L), f2, f5, localTextPaint);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.NetStatRuler
 * JD-Core Version:    0.6.2
 */