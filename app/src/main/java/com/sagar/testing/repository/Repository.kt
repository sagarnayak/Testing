package com.sagar.testing.repository

import android.content.SharedPreferences
import com.sagar.android.logutilmaster.LogUtil
import com.sagar.testing.network.ApiInterface
import com.sagar.testing.util.repository.SuperRepository

class Repository(
    private val pref: SharedPreferences,
    private val logUtil: LogUtil,
    private val apiInterface: ApiInterface
) : SuperRepository() {

fun getUsres(){
    makeApiCall(
        aiin
    )
}
}