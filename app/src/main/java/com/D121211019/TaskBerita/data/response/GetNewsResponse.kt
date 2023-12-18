package com.D121211019.TaskBerita.data.response

import com.D121211019.TaskBerita.data.modelData.News
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GetNewsResponse(
    @SerialName("count")
    val count: Int?,
    @SerialName("lastItemIndex")
    val lastItemIndex: Int?,
    @SerialName("page")
    val page: Int?,
    @SerialName("results")
    val results: List<News>?,
    @SerialName("totalCount")
    val totalCount: Int?,
    @SerialName("totalPages")
    val totalPages: Int?
)
