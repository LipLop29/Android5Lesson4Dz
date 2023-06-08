package com.example.android5lesson4dz.data.remote.dtos

import com.example.android5lesson4dz.domain.models.Titles
import com.google.gson.annotations.SerializedName

data class TitlesDto(
    @SerializedName("en_jp")
    val enJp: String
)

fun TitlesDto.toDomain(): Titles {
    return Titles(enJp)
}