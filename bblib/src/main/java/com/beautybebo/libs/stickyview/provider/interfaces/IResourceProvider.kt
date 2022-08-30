package com.beautybebo.libs.stickyview.provider.interfaces

import androidx.annotation.StyleableRes

internal interface IResourceProvider {
    fun getResourceId(@StyleableRes styleResId: Int): Int
    fun recycle()
}