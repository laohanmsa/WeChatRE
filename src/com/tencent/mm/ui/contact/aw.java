package com.tencent.mm.ui.contact;

import android.os.Handler;
import android.os.Message;
import com.tencent.mm.model.b;
import com.tencent.mm.plugin.nearby.b.l;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.h;
import com.tencent.mm.ui.ch;
import com.tencent.mm.v.i;

final class aw extends Handler
{
  aw(boolean paramBoolean)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = com.tencent.mm.model.y.gN();
    if (this.cEr);
    for (int j = i & 0xFFFFFDFF; ; j = i | 0x200)
    {
      com.tencent.mm.model.bd.hL().fN().set(34, Integer.valueOf(j));
      com.tencent.mm.model.bd.hL().fP().a(new com.tencent.mm.storage.bd(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", j, "", 0, "", 0));
      com.tencent.mm.model.bd.hM().d(new i(5));
      if (!this.cEr)
        l.zG();
      if (this.cEs != null)
        this.cEs.aM(null);
      return;
    }
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.aw
 * JD-Core Version:    0.6.2
 */