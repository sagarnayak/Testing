package com.sagar.testing.repository

import android.content.SharedPreferences
import com.sagar.android.logutilmaster.LogUtil
import com.sagar.testing.model.UsersResponse
import com.sagar.testing.network.ApiInterface
import com.sagar.testing.util.repository.SuperRepository
import com.sagar.testing.util.repository.SuperRepositoryCallback

class Repository(
    private val pref: SharedPreferences,
    private val logUtil: LogUtil,
    private val apiInterface: ApiInterface
) : SuperRepository() {

    fun getUsers() {
        makeApiCall(
            apiInterface.getUsers("1"),
            callback = object : SuperRepositoryCallback<UsersResponse> {
                override fun success(result: UsersResponse) {
                    super.success(result)

                    logUtil.logV(
                        """
                        the data is : 
                        $result
                    """.trimIndent()
                    )
                }
            }
        )
    }
}