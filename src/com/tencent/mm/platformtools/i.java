package com.tencent.mm.platformtools;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.mm.sdk.platformtools.n;

public final class i
  implements h
{
  private AudioManager agk;
  private g agl;
  private AudioManager.OnAudioFocusChangeListener agm = new j(this);
  private Context context;

  public i(Context paramContext)
  {
    this.context = paramContext;
  }

  public final void a(g paramg)
  {
    this.agl = paramg;
  }

  public final boolean requestFocus()
  {
    if ((this.agk == null) && (this.context != null))
      this.agk = ((AudioManager)this.context.getSystemService("audio"));
    if (this.agk != null)
    {
      n.ak("MicroMsg.AudioFocusHelper", "requestFocus");
      return 1 == this.agk.requestAudioFocus(this.agm, 3, 2);
    }
    return false;
  }

  public final boolean sX()
  {
    if ((this.agk == null) && (this.context != null))
      this.agk = ((AudioManager)this.context.getSystemService("audio"));
    if (this.agk != null)
    {
      n.ak("MicroMsg.AudioFocusHelper", "abandonFocus");
      return 1 == this.agk.abandonAudioFocus(this.agm);
    }
    return false;
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.i
 * JD-Core Version:    0.6.2
 */