package com.tencent.mm.ui.setting;

import android.text.InputFilter;
import android.text.Spanned;

final class be
  implements InputFilter
{
  be(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
  {
    if (paramCharSequence.length() <= 0)
      return paramSpanned.subSequence(paramInt3, paramInt4);
    return "";
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.be
 * JD-Core Version:    0.6.2
 */