.class public final Lcom/tencent/mm/modelfriend/ai;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private GI:I

.field private Ge:Ljava/lang/String;

.field private Ja:I

.field private Oi:I

.field private Oj:I

.field private Ok:I

.field private Ol:Ljava/lang/String;

.field private Om:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    .line 46
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Ge:Ljava/lang/String;

    iput v1, p0, Lcom/tencent/mm/modelfriend/ai;->Oi:I

    iput v1, p0, Lcom/tencent/mm/modelfriend/ai;->Ja:I

    iput v1, p0, Lcom/tencent/mm/modelfriend/ai;->Oj:I

    iput v1, p0, Lcom/tencent/mm/modelfriend/ai;->Ok:I

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Ol:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Om:Ljava/lang/String;

    .line 47
    return-void
.end method


# virtual methods
.method public final aX(I)V
    .locals 0
    .parameter

    .prologue
    .line 108
    iput p1, p0, Lcom/tencent/mm/modelfriend/ai;->Oi:I

    .line 109
    return-void
.end method

.method public final aY(I)V
    .locals 0
    .parameter

    .prologue
    .line 116
    iput p1, p0, Lcom/tencent/mm/modelfriend/ai;->Ja:I

    .line 117
    return-void
.end method

.method public final cX()Landroid/content/ContentValues;
    .locals 3

    .prologue
    .line 70
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 71
    iget v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 72
    const-string v0, "username"

    invoke-virtual {p0}, Lcom/tencent/mm/modelfriend/ai;->getUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    :cond_0
    iget v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 75
    const-string v0, "friendtype"

    iget v2, p0, Lcom/tencent/mm/modelfriend/ai;->Oi:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 77
    :cond_1
    iget v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_2

    .line 78
    const-string v0, "updatetime"

    iget v2, p0, Lcom/tencent/mm/modelfriend/ai;->Ja:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 80
    :cond_2
    iget v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_3

    .line 81
    const-string v0, "reserved1"

    iget v2, p0, Lcom/tencent/mm/modelfriend/ai;->Oj:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 83
    :cond_3
    iget v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_4

    .line 84
    const-string v0, "reserved2"

    iget v2, p0, Lcom/tencent/mm/modelfriend/ai;->Ok:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 86
    :cond_4
    iget v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_5

    .line 87
    const-string v2, "reserved3"

    iget-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Ol:Ljava/lang/String;

    if-nez v0, :cond_7

    const-string v0, ""

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :cond_5
    iget v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_6

    .line 90
    const-string v2, "reserved4"

    iget-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Om:Ljava/lang/String;

    if-nez v0, :cond_8

    const-string v0, ""

    :goto_1
    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_6
    return-object v1

    .line 87
    :cond_7
    iget-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Ol:Ljava/lang/String;

    goto :goto_0

    .line 90
    :cond_8
    iget-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Om:Ljava/lang/String;

    goto :goto_1
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Ge:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/tencent/mm/modelfriend/ai;->Ge:Ljava/lang/String;

    goto :goto_0
.end method

.method public final iH()V
    .locals 1

    .prologue
    .line 96
    const/4 v0, -0x1

    iput v0, p0, Lcom/tencent/mm/modelfriend/ai;->GI:I

    .line 97
    return-void
.end method

.method public final setUsername(Ljava/lang/String;)V
    .locals 0
    .parameter

    .prologue
    .line 100
    iput-object p1, p0, Lcom/tencent/mm/modelfriend/ai;->Ge:Ljava/lang/String;

    .line 101
    return-void
.end method