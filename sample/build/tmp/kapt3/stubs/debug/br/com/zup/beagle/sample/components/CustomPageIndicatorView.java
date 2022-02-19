package br.com.zup.beagle.sample.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\nJ-\u0010\u001c\u001a\u00020\u000e2%\u0010\b\u001a!\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tj\u0002`\u000fR\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R1\u0010\b\u001a%\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tj\u0004\u0018\u0001`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lbr/com/zup/beagle/sample/components/CustomPageIndicatorView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "error/NonExistentClass", "Lerror/NonExistentClass;", "onIndexChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "index", "", "Lbr/com/zup/beagle/sample/components/OnIndexChanged;", "pagesCount", "selectedColor", "selectedItem", "unselectedColor", "bind", "setBackButtonVisibility", "visibility", "setContinueButtonVisibility", "setCount", "pages", "setCurrentIndex", "newIndex", "setIndexChangedListener", "sample_debug"})
public final class CustomPageIndicatorView extends android.widget.RelativeLayout {
    private final int selectedColor = android.graphics.Color.WHITE;
    private final int unselectedColor = android.graphics.Color.GRAY;
    private int selectedItem = 0;
    private int pagesCount = 0;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onIndexChanged;
    private final error.NonExistentClass binding = null;
    
    public CustomPageIndicatorView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    private final void bind() {
    }
    
    public final void setCount(int pages) {
    }
    
    public final void setCurrentIndex(int newIndex) {
    }
    
    public final void setIndexChangedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onIndexChanged) {
    }
    
    public final void setContinueButtonVisibility(int visibility) {
    }
    
    public final void setBackButtonVisibility(int visibility) {
    }
}