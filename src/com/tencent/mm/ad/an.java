package com.tencent.mm.ad;

import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.bb;

final class an extends bb
{
  an(am paramam, int paramInt)
  {
    super(1000L, null);
  }

  protected final Object run()
  {
    try
    {
      am.a(this.adV, this.Iq);
      label11: return null;
    }
    catch (RemoteException localRemoteException)
    {
      break label11;
    }
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.an
 * JD-Core Version:    0.6.2
 */