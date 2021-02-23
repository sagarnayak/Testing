package com.sagar.testing

import android.content.Context

class ResourceComparere {

    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }
}