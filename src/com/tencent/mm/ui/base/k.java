package com.tencent.mm.ui.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

final class k
  implements DialogInterface.OnCancelListener
{
  k(DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.ciH != null)
      this.ciH.onClick(paramDialogInterface, 0);
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.k
 * JD-Core Version:    0.6.2
 */