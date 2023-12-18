package com.D121211019.TaskBerita.data.modelData

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Parcelize
@Serializable
data class News(
    @SerialName("_id")
    val _id: String,
    @SerialName("title")
    val title: String,
    @SerialName("description")
    val description: String,
    @SerialName("author")
    val author: String,
    @SerialName("tags")
    val tags: List<String>
): Parcelable
