package com.sagar.testing.network

import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/{page}")
    fun getUsers(@Query("page") pageNumber: String): Observable<Response<ResponseBody>>
}