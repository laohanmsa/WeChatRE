package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.bg;

final class cs extends dd
{
  cs(cg paramcg)
  {
    super(paramcg, (byte)0);
  }

  public final boolean b(ce paramce)
  {
    boolean bool1 = System.currentTimeMillis() - paramce.ip() < 3600000L;
    boolean bool2 = false;
    if (bool1)
    {
      int i = bg.getInt(paramce.io(), 0);
      bool2 = false;
      if (i > 0)
      {
        cg.d(23, paramce.io() + "_43");
        paramce.cj("0").f(System.currentTimeMillis());
        bool2 = true;
      }
    }
    return bool2;
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cs
 * JD-Core Version:    0.6.2
 */