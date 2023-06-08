package com.example.android5lesson4dz.data.remote.apiservices

import com.example.android5lesson4dz.data.remote.dtos.DataItemDto
import com.example.android5lesson4dz.data.remote.dtos.ResponseDto
import retrofit2.http.GET

interface AnimeApiService {

    @GET("edge/anime")
    suspend fun fetchAnime(): ResponseDto<DataItemDto>
}