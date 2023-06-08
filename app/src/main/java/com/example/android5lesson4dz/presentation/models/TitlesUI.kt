package com.example.android5lesson4dz.presentation.models

import android.os.Parcelable
import com.example.android5lesson4dz.domain.models.Titles
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class TitlesUI(
    @SerializedName("en_jp")
    val enJp: String
): Parcelable

fun Titles.toUI(): TitlesUI {
    return TitlesUI(enJp)
}