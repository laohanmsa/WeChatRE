package com.tencent.mm.ui.chatting;

final class gh
  implements Runnable
{
  gh(ChattingUI paramChattingUI)
  {
  }

  public final void run()
  {
    if (this.cAk.czB != null)
      this.cAk.czB.notifyDataSetChanged();
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gh
 * JD-Core Version:    0.6.2
 */