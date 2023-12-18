package com.D121211019.TaskBerita.data.source

import com.D121211019.TaskBerita.data.response.GetNewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("everything")
    suspend fun getNews(
        @Query("Authorization") Authorization: String = "38cR2Vet7Ca_gS7CS-_IJ9Nok2gcN4bMNkQ3onRb-yhDQvLn"
    ): GetNewsResponse
}