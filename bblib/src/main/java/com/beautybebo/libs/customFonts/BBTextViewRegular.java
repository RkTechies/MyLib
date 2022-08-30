package com.beautybebo.libs.customFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class BBTextViewRegular extends TextView {
    Context ctx;

    public BBTextViewRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.ctx = context;
            setTypeface(Typeface.createFromAsset(context.getAssets(), "nunito_regular.ttf"));
    }
}
