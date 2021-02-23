package com.sagar.testing.shared_pref

import android.content.Context
import android.content.SharedPreferences

class SharedPrefModule(context: Context) {

    var pref: SharedPreferences = context.getSharedPreferences(
        "dvjkdhfvj",
        Context.MODE_PRIVATE
    )
}