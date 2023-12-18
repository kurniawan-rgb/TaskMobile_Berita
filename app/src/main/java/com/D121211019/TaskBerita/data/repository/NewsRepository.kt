package com.D121211019.TaskBerita.data.repository

import com.D121211019.TaskBerita.data.response.GetNewsResponse
import com.D121211019.TaskBerita.data.source.ApiService

class NewsRepository(private val apiService:ApiService) {
    suspend fun getNews():GetNewsResponse{
        return apiService.getNews();
    }
}