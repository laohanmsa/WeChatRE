package com.tencent.mm.ad.a;

import android.os.IBinder;
import android.os.Parcel;

final class m
  implements k
{
  private IBinder mRemote;

  m(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }

  public final void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
      localParcel1.writeInt(paramInt1);
      localParcel1.writeInt(paramInt2);
      localParcel1.writeString(paramString1);
      localParcel1.writeInt(paramInt3);
      localParcel1.writeString(paramString2);
      if (paramBoolean);
      while (true)
      {
        localParcel1.writeInt(i);
        this.mRemote.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
        i = 0;
      }
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }

  public final IBinder asBinder()
  {
    return this.mRemote;
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.a.m
 * JD-Core Version:    0.6.2
 */