package com.tencent.mm.ui.contact;

import android.os.Handler;
import android.os.Message;
import com.tencent.mm.model.b;
import com.tencent.mm.plugin.c.a.a;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.h;
import com.tencent.mm.ui.ch;
import com.tencent.mm.v.i;

final class dy extends Handler
{
  dy(boolean paramBoolean)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    dt.bs(this.cEr);
    int i = com.tencent.mm.model.y.gN();
    if (this.cEr);
    for (int j = i & 0xFFFFFFFD; ; j = i | 0x2)
    {
      com.tencent.mm.model.bd.hL().fN().set(34, Integer.valueOf(j));
      com.tencent.mm.model.bd.hL().fP().a(new com.tencent.mm.storage.bd(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", j, "", 0, "", 0));
      com.tencent.mm.model.bd.hM().d(new i(5));
      if (!this.cEr)
        a.LJ();
      if (this.cEs != null)
        this.cEs.aM(null);
      return;
    }
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dy
 * JD-Core Version:    0.6.2
 */