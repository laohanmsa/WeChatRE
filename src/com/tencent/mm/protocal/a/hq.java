package com.tencent.mm.protocal.a;

import a.a.a.c;

public final class hq extends com.tencent.mm.ae.a
{
  private String aVy;
  private boolean aVz;
  private int bED;
  private boolean bEE;
  private String bLx;
  private boolean bLy;
  private int bPW;
  private boolean bPX;

  private hq UY()
  {
    if ((!this.bPX) || (!this.bEE))
      throw new c("Not all required fields were included (false = not included in message),  ExtInfoSeq:" + this.bPX + " ImgUpdateSeq:" + this.bEE);
    return this;
  }

  public static hq bZ(byte[] paramArrayOfByte)
  {
    a.a.a.a.a locala = new a.a.a.a.a(paramArrayOfByte, buU);
    int i = locala.alZ();
    hq localhq = new hq();
    if (i > 0)
    {
      int j;
      switch (i)
      {
      default:
        j = 0;
      case 1:
      case 2:
      case 3:
      case 4:
      }
      while (true)
      {
        if (j == 0)
          locala.ama();
        i = locala.alZ();
        break;
        localhq.aVy = locala.alU();
        localhq.aVz = true;
        j = 1;
        continue;
        localhq.bLx = locala.alU();
        localhq.bLy = true;
        j = 1;
        continue;
        localhq.bPW = locala.alS();
        localhq.bPX = true;
        j = 1;
        continue;
        localhq.bED = locala.alS();
        localhq.bEE = true;
        j = 1;
      }
    }
    return localhq.UY();
  }

  public final int Qo()
  {
    return this.bED;
  }

  public final int UX()
  {
    return this.bPW;
  }

  public final void a(a.a.a.c.a parama)
  {
    if (this.aVz)
      parama.p(1, this.aVy);
    if (this.bLy)
      parama.p(2, this.bLx);
    parama.aa(3, this.bPW);
    parama.aa(4, this.bED);
  }

  public final int cE()
  {
    boolean bool = this.aVz;
    int i = 0;
    if (bool)
      i = 0 + a.a.a.b.b.a.o(1, this.aVy);
    if (this.bLy)
      i += a.a.a.b.b.a.o(2, this.bLx);
    return 0 + (i + a.a.a.a.U(3, this.bPW) + a.a.a.a.U(4, this.bED));
  }

  public final String getDisplayName()
  {
    return this.bLx;
  }

  public final String getUserName()
  {
    return this.aVy;
  }

  public final byte[] toByteArray()
  {
    UY();
    return super.toByteArray();
  }

  public final String toString()
  {
    String str1 = "" + getClass().getName() + "(";
    if (this.aVz)
      str1 = str1 + "UserName = " + this.aVy + "   ";
    if (this.bLy)
      str1 = str1 + "DisplayName = " + this.bLx + "   ";
    String str2 = str1 + "ExtInfoSeq = " + this.bPW + "   ";
    String str3 = str2 + "ImgUpdateSeq = " + this.bED + "   ";
    return str3 + ")";
  }
}

/* Location:           /home/danghvu/0day/WeChat/WeChat_4.5_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.hq
 * JD-Core Version:    0.6.2
 */