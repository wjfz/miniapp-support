package com.zxy.ijplugin.wechat_miniprogram.lang.wxss;

import com.intellij.lang.css.CSSLanguage;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WXSSLanguage extends CSSLanguage {

    public static WXSSLanguage INSTANCE = new WXSSLanguage();

    private WXSSLanguage(){
        super("WXSS");
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return super.getDisplayName();
    }

    @Nullable
    @Override
    public LanguageFileType getAssociatedFileType() {
        return WXSSFileType.INSTANCE;
    }
}
