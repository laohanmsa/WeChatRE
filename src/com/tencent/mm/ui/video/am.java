package com.tencent.mm.ui.video;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class am
  implements DialogInterface.OnClickListener
{
  am(VideoRecorderUI paramVideoRecorderUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.cZf.finish();
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.video.am
 * JD-Core Version:    0.6.2
 */