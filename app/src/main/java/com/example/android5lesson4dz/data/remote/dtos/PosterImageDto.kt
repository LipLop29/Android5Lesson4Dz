package com.example.android5lesson4dz.data.remote.dtos

import com.example.android5lesson4dz.domain.models.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageDto(
    @SerializedName("original")
    val original: String,
    @SerializedName("large")
    val large: String
)

fun PosterImageDto.toDomain(): PosterImage {
    return PosterImage(original, large)
}