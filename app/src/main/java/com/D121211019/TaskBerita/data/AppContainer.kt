package com.D121211019.TaskBerita.data

import com.D121211019.TaskBerita.data.source.ApiService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory

interface AppContainer{

}


class DefaultAppContainer: AppContainer {
    private val BASE_URL = "https://api.currentsapi.services/v1/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()
    private val retrofitService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}