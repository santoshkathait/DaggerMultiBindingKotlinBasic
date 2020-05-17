package com.kat.daggermultibindingmvvmsample

import io.reactivex.Single
import retrofit2.http.GET

interface ApiClient {

    @GET("/api/users?page=2")
    fun getData() : Single<DataModel>
}