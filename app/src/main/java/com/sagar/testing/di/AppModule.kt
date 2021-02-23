package com.sagar.testing.di

import android.content.Context
import com.sagar.android.logutilmaster.LogUtil
import com.sagar.testing.BuildConfig
import com.sagar.testing.network.NetworkModule
import com.sagar.testing.shared_pref.SharedPrefModule
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesLogUtil() = LogUtil(
        LogUtil.Builder()
            .setCustomLogTag("fhvgbdfvh")
            .setShouldHideLogInReleaseMode(
                false,
                BuildConfig.DEBUG
            )
    )

    @Singleton
    @Provides
    fun providesNetworkModule(logUtil: LogUtil) = NetworkModule(logUtil).apiInterface

    @Singleton
    @Provides
    fun providesSharedPref(@ApplicationContext context: Context) = SharedPrefModule(context).pref
}