package com.beautybebo.libs.customFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class BBTextViewBold extends TextView {
    public BBTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
            setTypeface(Typeface.createFromAsset(context.getAssets(), "nunito_bold.ttf"));
    }
}
