package com.tencent.mm.ui.contact;

import android.os.Handler;
import com.tencent.mm.ui.base.bc;
import java.util.TimerTask;

final class ax extends TimerTask
{
  ax(bc parambc, Handler paramHandler)
  {
  }

  public final void run()
  {
    if (this.aHo != null)
    {
      this.aHo.dismiss();
      this.cEt.sendEmptyMessage(0);
    }
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ax
 * JD-Core Version:    0.6.2
 */