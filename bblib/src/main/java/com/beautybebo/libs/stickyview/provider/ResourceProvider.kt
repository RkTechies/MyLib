package com.beautybebo.libs.stickyview.provider

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import androidx.annotation.StyleableRes
import com.beautybebo.libs.stickyview.provider.interfaces.IResourceProvider

internal class ResourceProvider(context: Context, attrs: AttributeSet?, @StyleableRes styleRes: IntArray) :
    IResourceProvider {
    private val mTypeArray: TypedArray = context.obtainStyledAttributes(attrs, styleRes)
    override fun getResourceId(@StyleableRes styleResId: Int): Int {
        return mTypeArray.getResourceId(styleResId, 0)
    }

    override fun recycle() {
        mTypeArray.recycle()
    }

}