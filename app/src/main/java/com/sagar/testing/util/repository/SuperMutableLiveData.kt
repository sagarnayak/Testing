package com.sagar.testing.util.repository

import androidx.lifecycle.MutableLiveData

class SuperMutableLiveData<T> {

    private var success: MutableLiveData<Event<T>> = MutableLiveData()
    private var fail: MutableLiveData<Event<Result>> = MutableLiveData()

    fun getSuccess() = success

    fun getFail() = fail
}