package com.tencent.mm.ui.applet;

import android.view.View;
import android.view.View.OnClickListener;

final class z
  implements View.OnClickListener
{
  z(SecurityImage paramSecurityImage)
  {
  }

  public final void onClick(View paramView)
  {
    SecurityImage.a(this.cmP);
    if (SecurityImage.b(this.cmP) != null)
      SecurityImage.b(this.cmP).aee();
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.z
 * JD-Core Version:    0.6.2
 */