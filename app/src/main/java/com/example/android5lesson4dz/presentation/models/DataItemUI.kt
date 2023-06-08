package com.example.android5lesson4dz.presentation.models

import android.os.Parcelable
import com.example.android5lesson4dz.domain.models.DataItem
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataItemUI(
    @SerializedName("id")
    val id: String,
    @SerializedName("attributes")
    val attributes: AttributesUI,
    @SerializedName("type")
    val type: String
): Parcelable

fun DataItem.toUI(): DataItemUI {
    return DataItemUI(id, attributes.toUI(), type)
}