

// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel(Kf.J p2, Kf.I p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "getYellowRoseRedeemNudgeExtrasUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "getYellowRoseRedeemInfoUseCase");
        this.C = p2;
        this.D = p3;
        androidx.lifecycle.z v2_4 = new androidx.lifecycle.z();
        this.E = v2_4;
        this.F = v2_4;
        this.G = new androidx.lifecycle.z();
        return;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$a;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$a(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p4)
    {
        if ((((Oe.v0) p4) instanceof Oe.v0$d)) {
            kotlin.Unit v4_4 = ((Oe.v0$d) ((Oe.v0) p4)).a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_4);
            this.a.x0(0, ((Mf.y) v4_4).c(), 1);
        }
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$b;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$b(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p4)
    {
        if ((((Oe.v0) p4) instanceof Oe.v0$d)) {
            kotlin.Unit v4_8 = ((Oe.v0$d) ((Oe.v0) p4)).a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_8);
            kotlin.Unit v4_9 = ((Mf.J) v4_8);
            android.widget.TextView v0_8 = this.a;
            M8.H9 v1 = v0_8.w0();
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append(((com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel) v0_8.n0.getValue()).i());
            v2_1.append(((int) (v4_9.e() * ((float) v4_9.f()))));
            v1.c.setText(v2_1.toString());
        }
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$c;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$c(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p3)
    {
        com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog v0 = this.a;
        androidx.fragment.app.s.a(B2.d.a(), v0, "on_dismiss");
        v0.Q();
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$d;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$d(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p5)
    {
        p5 = com.dating.chat.userProperties.UserPropertiesActivity.f0;
        kotlin.Unit v5_2 = this.a;
        android.content.Context v0 = v5_2.requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0, "requireContext(...)");
        com.dating.chat.userProperties.UserPropertiesActivity$a.a(v0, "yellow_rose", kotlin.collections.L.b(new kotlin.Pair("direct_redeem", "true")));
        v5_2.Q();
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$e;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$e(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p1)
    {
        this.a.Q();
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$f;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$f(kotlin.jvm.functions.Function1 p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "function");
        this.a = ((kotlin.jvm.internal.Lambda) p2);
        return;
    }

// Method: a

    public final synthetic void a(Object p2)
    {
        this.a.invoke(p2);
        return;
    }

// Method: c

    public final kotlin.d c()
    {
        return this.a;
    }

// Method: equals

    public final boolean equals(Object p3)
    {
        boolean v1 = 0;
        if (((p3 instanceof androidx.lifecycle.A)) && ((p3 instanceof kotlin.jvm.internal.m))) {
            v1 = kotlin.jvm.internal.Intrinsics.areEqual(this.a, ((kotlin.jvm.internal.m) p3).c());
        }
        return v1;
    }

// Method: hashCode

    public final int hashCode()
    {
        return this.a.hashCode();
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$g;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$g(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        return this.a;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$h;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$h(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$g p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        return ((androidx.lifecycle.ViewModelStoreOwner) this.a.invoke());
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$i;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$i(kotlin.Lazy p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        return ((androidx.lifecycle.ViewModelStoreOwner) this.a.getValue()).getViewModelStore();
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$j;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$j(kotlin.Lazy p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        androidx.lifecycle.viewmodel.CreationExtras$Empty v0_4;
        androidx.lifecycle.viewmodel.CreationExtras$Empty v0_3 = ((androidx.lifecycle.ViewModelStoreOwner) this.a.getValue());
        if (!(v0_3 instanceof androidx.lifecycle.i)) {
            v0_4 = 0;
        } else {
            v0_4 = ((androidx.lifecycle.i) v0_3);
        }
        androidx.lifecycle.viewmodel.CreationExtras$Empty v0_1;
        if (v0_4 == null) {
            v0_1 = androidx.lifecycle.viewmodel.CreationExtras$Empty.b;
        } else {
            v0_1 = v0_4.getDefaultViewModelCreationExtras();
        }
        return v0_1;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$k;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$k(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog p1, kotlin.Lazy p2)
    {
        this.a = p1;
        this.b = p2;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        androidx.lifecycle.ViewModelProvider$Factory v0_5;
        androidx.lifecycle.ViewModelProvider$Factory v0_4 = ((androidx.lifecycle.ViewModelStoreOwner) this.b.getValue());
        if (!(v0_4 instanceof androidx.lifecycle.i)) {
            v0_5 = 0;
        } else {
            v0_5 = ((androidx.lifecycle.i) v0_4);
        }
        androidx.lifecycle.ViewModelProvider$Factory v0_1;
        if (v0_5 == null) {
            v0_1 = this.a.getDefaultViewModelProviderFactory();
        } else {
            v0_1 = v0_5.getDefaultViewModelProviderFactory();
            if (v0_1 == null) {
            }
        }
        return v0_1;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeBackConfirmationDialog;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeBackConfirmationDialog()
    {
        androidx.lifecycle.T v0_4 = kotlin.LazyKt.a(kotlin.j.NONE, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$h(new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$g(this)));
        this.n0 = new androidx.lifecycle.T(kotlin.jvm.internal.G.a.b(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$i(v0_4), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$k(this, v0_4), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$j(v0_4));
        return;
    }

// Method: d0

    public final int d0()
    {
        return -1;
    }

// Method: i0

    public final int i0()
    {
        return -1;
    }

// Method: onCreateView

    public final android.view.View onCreateView(android.view.LayoutInflater p9, android.view.ViewGroup p10, android.os.Bundle p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "inflater");
        String v9_5 = p9.inflate(2131559527, 0, 0);
        int v10_1 = 2131361904;
        if (((com.facebook.shimmer.ShimmerFrameLayout) Au.a.b(2131361904, v9_5)) != null) {
            v10_1 = 2131361927;
            if (((android.widget.TextView) Au.a.b(2131361927, v9_5)) != null) {
                v10_1 = 2131362386;
                android.widget.TextView v2_1 = ((android.widget.TextView) Au.a.b(2131362386, v9_5));
                if (v2_1 != null) {
                    v10_1 = 2131364579;
                    android.widget.TextView v3_1 = ((android.widget.TextView) Au.a.b(2131364579, v9_5));
                    if (v3_1 != null) {
                        v10_1 = 2131364613;
                        android.view.View v4 = Au.a.b(2131364613, v9_5);
                        if (v4 != null) {
                            int v10_4 = ((android.widget.FrameLayout) v9_5);
                            String v11_6 = 2131365689;
                            androidx.appcompat.widget.AppCompatTextView v6_1 = ((androidx.appcompat.widget.AppCompatTextView) Au.a.b(2131365689, v9_5));
                            if (v6_1 != null) {
                                v11_6 = 2131367478;
                                android.widget.TextView v7_1 = ((android.widget.TextView) Au.a.b(2131367478, v9_5));
                                if (v7_1 != null) {
                                    String v9_4 = new M8.H9;
                                    v9_4(v10_4, v2_1, v3_1, v4, v10_4, v6_1, v7_1);
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(v9_4);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v9_4, "<set-?>");
                                    this.o0 = v9_4;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v10_4, "root");
                                    return v10_4;
                                }
                            }
                            v10_1 = v11_6;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(v9_5.getResources().getResourceName(v10_1)));
    }

// Method: onSaveInstanceState

    public final void onSaveInstanceState(android.os.Bundle p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "outState");
        this.Q();
        super.onSaveInstanceState(p2);
        return;
    }

// Method: onViewCreated

    public final void onViewCreated(android.view.View p4, android.os.Bundle p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "view");
        super.onViewCreated(p4, p5);
        android.widget.FrameLayout v4_1 = this.n0;
        ((com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel) v4_1.getValue()).G.e(this.getViewLifecycleOwner(), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$f(new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$a(this)));
        ((com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel) v4_1.getValue()).F.e(this, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$f(new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$b(this)));
        com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$e v5_5 = ((com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel) v4_1.getValue());
        rt.j.p(yc.w.U0(v5_5.C.a.d7(), v5_5.G), androidx.lifecycle.S.a(v5_5));
        android.widget.FrameLayout v4_3 = ((com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$Viewmodel) v4_1.getValue());
        rt.j.p(yc.w.U0(v4_3.D.a.V7(), v4_3.E), androidx.lifecycle.S.a(v4_3));
        android.widget.FrameLayout v4_5 = this.w0();
        com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$e v5_12 = v4_5.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_12, "cancel");
        yc.w.i(v5_12, 0, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$c(this), 3);
        android.widget.FrameLayout v4_6 = v4_5.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_6, "withdraw");
        yc.w.i(v4_6, 0, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$d(this), 3);
        android.widget.FrameLayout v4_8 = this.w0().e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_8, "root");
        yc.w.i(v4_8, 0, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog$e(this), 3);
        return;
    }

// Method: q0

    public final boolean q0()
    {
        androidx.fragment.app.s.a(B2.d.a(), this, "on_dismiss");
        this.Q();
        return 1;
    }

// Method: w0

    public final M8.H9 w0()
    {
        int v0_0 = this.o0;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.j("ui");
            throw 0;
        } else {
            return v0_0;
        }
    }

// Method: x0

    public final void x0(int p4, java.util.List p5, boolean p6)
    {
        this.w0().f.setTranslationX((- ((float) this.w0().f.getWidth())));
        android.view.ViewPropertyAnimator v4_1 = this.w0().f.animate().translationX(0).setDuration(600).withStartAction(new xc.k(p4, this, p5)).withEndAction(new xc.l(p4, this, p5));
        if (!p6) {
            v4_1.setStartDelay(100);
        }
        v4_1.start();
        return;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$Viewmodel;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$Viewmodel(Kf.J p2, Kf.I p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "getYellowRoseRedeemNudgeExtrasUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "getYellowRoseRedeemInfoUseCase");
        this.C = p2;
        this.D = p3;
        androidx.lifecycle.z v2_4 = new androidx.lifecycle.z();
        this.E = v2_4;
        this.F = v2_4;
        this.G = new androidx.lifecycle.z();
        return;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$a;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$a(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p4)
    {
        float v1_0 = this.a;
        if (!(((Oe.v0) p4) instanceof Oe.v0$d)) {
            if ((((Oe.v0) p4) instanceof Oe.v0$a)) {
                v1_0.requireActivity().finish();
            }
        } else {
            boolean v4_3 = ((Oe.v0$d) ((Oe.v0) p4)).a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_3);
            boolean v4_4 = ((Mf.J) v4_3);
            v1_0.w0().g.setText(String.valueOf(v4_4.f()));
            boolean v0_3 = v1_0.w0();
            StringBuilder v2_3 = new StringBuilder();
            v2_3.append(v1_0.x0().i());
            v2_3.append(((int) (v4_4.e() * ((float) v4_4.f()))));
            v0_3.e.setText(v2_3.toString());
        }
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$b;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$b(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p5)
    {
        if (!(((Oe.v0) p5) instanceof Oe.v0$d)) {
            // Both branches of the condition point to the same code.
            // if ((((Oe.v0) p5) instanceof Oe.v0$a)) {
            // }
        } else {
            boolean v5_6 = ((Oe.v0$d) ((Oe.v0) p5)).a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(v5_6);
            boolean v5_7 = ((Mf.y) v5_6);
            boolean v0_1 = this.a;
            v0_1.w0().b.setText(v0_1.getString(2131953716, new Object[] {v5_7.b()})));
            boolean v0_3 = v0_1.w0().d;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_3, "lastYrGiverAvatar");
            boolean v5_2 = v5_7.a();
            D5.g v1_4 = D5.a.a(v0_3.getContext());
            P5.h$a v2_4 = new P5.h$a(v0_3.getContext());
            v2_4.c = v5_2;
            v2_4.c(v0_3);
            v1_4.c(v2_4.a());
        }
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$c;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$c(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog p1)
    {
        this.a = p1;
        super(2);
        return;
    }

// Method: invoke

    public final Object invoke(Object p2, Object p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(((String) p2), "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(((android.os.Bundle) p3), "<anonymous parameter 1>");
        if (kotlin.jvm.internal.Intrinsics.areEqual(((String) p2), "on_dismiss")) {
            this.a.R(0, 0, 0);
        }
        return kotlin.Unit.INSTANCE;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$d;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$d(kotlin.jvm.functions.Function1 p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "function");
        this.a = ((kotlin.jvm.internal.Lambda) p2);
        return;
    }

// Method: a

    public final synthetic void a(Object p2)
    {
        this.a.invoke(p2);
        return;
    }

// Method: c

    public final kotlin.d c()
    {
        return this.a;
    }

// Method: equals

    public final boolean equals(Object p3)
    {
        boolean v1 = 0;
        if (((p3 instanceof androidx.lifecycle.A)) && ((p3 instanceof kotlin.jvm.internal.m))) {
            v1 = kotlin.jvm.internal.Intrinsics.areEqual(this.a, ((kotlin.jvm.internal.m) p3).c());
        }
        return v1;
    }

// Method: hashCode

    public final int hashCode()
    {
        return this.a.hashCode();
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$e;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$e(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        return this.a;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$f;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$f(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$e p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        return ((androidx.lifecycle.ViewModelStoreOwner) this.a.invoke());
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$g;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$g(kotlin.Lazy p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        return ((androidx.lifecycle.ViewModelStoreOwner) this.a.getValue()).getViewModelStore();
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$h;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$h(kotlin.Lazy p1)
    {
        this.a = p1;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        androidx.lifecycle.viewmodel.CreationExtras$Empty v0_4;
        androidx.lifecycle.viewmodel.CreationExtras$Empty v0_3 = ((androidx.lifecycle.ViewModelStoreOwner) this.a.getValue());
        if (!(v0_3 instanceof androidx.lifecycle.i)) {
            v0_4 = 0;
        } else {
            v0_4 = ((androidx.lifecycle.i) v0_3);
        }
        androidx.lifecycle.viewmodel.CreationExtras$Empty v0_1;
        if (v0_4 == null) {
            v0_1 = androidx.lifecycle.viewmodel.CreationExtras$Empty.b;
        } else {
            v0_1 = v0_4.getDefaultViewModelCreationExtras();
        }
        return v0_1;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog$i;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog$i(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog p1, kotlin.Lazy p2)
    {
        this.a = p1;
        this.b = p2;
        super(0);
        return;
    }

// Method: invoke

    public final Object invoke()
    {
        androidx.lifecycle.ViewModelProvider$Factory v0_5;
        androidx.lifecycle.ViewModelProvider$Factory v0_4 = ((androidx.lifecycle.ViewModelStoreOwner) this.b.getValue());
        if (!(v0_4 instanceof androidx.lifecycle.i)) {
            v0_5 = 0;
        } else {
            v0_5 = ((androidx.lifecycle.i) v0_4);
        }
        androidx.lifecycle.ViewModelProvider$Factory v0_1;
        if (v0_5 == null) {
            v0_1 = this.a.getDefaultViewModelProviderFactory();
        } else {
            v0_1 = v0_5.getDefaultViewModelProviderFactory();
            if (v0_1 == null) {
            }
        }
        return v0_1;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseRedeemFullscreenNudgeDialog;

// Method: <init>

    public YellowRoseRedeemFullscreenNudgeDialog()
    {
        androidx.lifecycle.T v0_4 = kotlin.LazyKt.a(kotlin.j.NONE, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$f(new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$e(this)));
        this.n0 = new androidx.lifecycle.T(kotlin.jvm.internal.G.a.b(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$Viewmodel), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$g(v0_4), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$i(this, v0_4), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$h(v0_4));
        return;
    }

// Method: d0

    public final int d0()
    {
        return -1;
    }

// Method: f0

    public final int f0()
    {
        return -1;
    }

// Method: i0

    public final int i0()
    {
        return -1;
    }

// Method: l0

    public final void l0()
    {
        this.x0().F.e(this, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$d(new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$a(this)));
        this.x0().G.e(this, new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$d(new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$b(this)));
        yc.w.n0(this, new String[] {"on_dismiss"}), new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$c(this));
        return;
    }

// Method: o0

    public final void o0()
    {
        android.widget.TextView v0_1 = this.w0().f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_1, "winNow");
        yc.w.i(v0_1, 0, new com.dating.chat.userProperties.yellowRose.a(this), 3);
        return;
    }

// Method: onCreateView

    public final android.view.View onCreateView(android.view.LayoutInflater p9, android.view.ViewGroup p10, android.os.Bundle p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "inflater");
        android.widget.LinearLayout v9_1 = p9.inflate(2131559526, 0, 0);
        String v10_1 = 2131361904;
        if (((com.facebook.shimmer.ShimmerFrameLayout) Au.a.b(2131361904, v9_1)) != null) {
            v10_1 = 2131361977;
            android.widget.TextView v2_1 = ((android.widget.TextView) Au.a.b(2131361977, v9_1));
            if (v2_1 != null) {
                v10_1 = 2131363952;
                android.widget.ImageView v3_1 = ((android.widget.ImageView) Au.a.b(2131363952, v9_1));
                if (v3_1 != null) {
                    v10_1 = 2131364182;
                    android.widget.ImageView v4_1 = ((android.widget.ImageView) Au.a.b(2131364182, v9_1));
                    if (v4_1 != null) {
                        v10_1 = 2131364300;
                        if (((android.widget.LinearLayout) Au.a.b(2131364300, v9_1)) != null) {
                            v10_1 = 2131364580;
                            if (((android.widget.LinearLayout) Au.a.b(2131364580, v9_1)) != null) {
                                v10_1 = 2131364581;
                                if (((android.widget.TextView) Au.a.b(2131364581, v9_1)) != null) {
                                    v10_1 = 2131365362;
                                    android.widget.TextView v5_1 = ((android.widget.TextView) Au.a.b(2131365362, v9_1));
                                    if (v5_1 != null) {
                                        v10_1 = 2131366818;
                                        if (((android.widget.TextView) Au.a.b(2131366818, v9_1)) != null) {
                                            v10_1 = 2131367461;
                                            android.widget.TextView v6_1 = ((android.widget.TextView) Au.a.b(2131367461, v9_1));
                                            if (v6_1 != null) {
                                                v10_1 = 2131367504;
                                                android.widget.TextView v7_1 = ((android.widget.TextView) Au.a.b(2131367504, v9_1));
                                                if (v7_1 != null) {
                                                    v10_1 = 2131367508;
                                                    if (((android.widget.TextView) Au.a.b(2131367508, v9_1)) != null) {
                                                        String v10_5 = new M8.G9;
                                                        android.widget.LinearLayout v9_5 = ((android.widget.LinearLayout) v9_1);
                                                        v10_5(v9_5, v2_1, v3_1, v4_1, v5_1, v6_1, v7_1);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(v10_5);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v10_5, "<set-?>");
                                                        this.o0 = v10_5;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v9_5, "getRoot(...)");
                                                        return v9_5;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(v9_1.getResources().getResourceName(v10_1)));
    }

// Method: q0

    public final boolean q0()
    {
        yc.w.C0(new com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeBackConfirmationDialog(), this.requireActivity(), 0);
        return 1;
    }

// Method: t0

    public final void t0()
    {
        ah.d v0_0 = this.x0();
        rt.j.p(yc.w.U0(v0_0.C.a.d7(), v0_0.G), androidx.lifecycle.S.a(v0_0));
        ah.d v0_2 = this.x0();
        rt.j.p(yc.w.U0(v0_2.D.a.V7(), v0_2.E), androidx.lifecycle.S.a(v0_2));
        this.b0().d("Screen", "YRRedeemNudge", "View", "Screen");
        return;
    }

// Method: w0

    public final M8.G9 w0()
    {
        int v0_0 = this.o0;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.j("ui");
            throw 0;
        } else {
            return v0_0;
        }
    }

// Method: x0

    public final com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$Viewmodel x0()
    {
        return ((com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog$Viewmodel) this.n0.getValue());
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/YellowRoseViewModel;

// Method: <init>

    public YellowRoseViewModel(Kf.I p2, Kf.V p3, Hf.G p4, Lg.w p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "getYellowRoseRedeemInfoUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "redeemYellowRoseUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "walletInfoUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "preferenceRepository");
        this.C = p3;
        this.D = p4;
        this.E = p5;
        t3.a v3_2 = new androidx.lifecycle.z();
        this.F = v3_2;
        this.G = v3_2;
        t3.a v3_4 = new androidx.lifecycle.z();
        this.H = v3_4;
        androidx.lifecycle.z v4_2 = new androidx.lifecycle.z();
        this.I = v4_2;
        this.J = v4_2;
        rt.j.p(yc.w.U0(p2.a.V7(), v3_4), androidx.lifecycle.S.a(this));
        return;
    }


// Class: Lcom/dating/chat/userProperties/yellowRose/a;

// Method: <init>

    public a(com.dating.chat.userProperties.yellowRose.YellowRoseRedeemFullscreenNudgeDialog p1)
    {
        this.a = p1;
        super(1);
        return;
    }

// Method: invoke

    public final Object invoke(Object p5)
    {
        kotlin.Unit v5_1 = this.a;
        if (!v5_1.x0().o()) {
            android.content.Context v0_5 = v5_1.requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_5, "requireContext(...)");
            com.dating.chat.userProperties.UserPropertiesActivity$a.a(v0_5, "yellow_rose", kotlin.collections.L.b(new kotlin.Pair("direct_redeem", "true")));
            v5_1.Q();
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("redeem_yr", "dialogType");
            android.content.Context v0_2 = new P8.e();
            String v2_3 = new android.os.Bundle();
            v2_3.putString("dialog_type", "redeem_yr");
            v0_2.setArguments(v2_3);
            yc.w.C0(v0_2, v5_1.getActivity(), 0);
        }
        return kotlin.Unit.INSTANCE;
    }
