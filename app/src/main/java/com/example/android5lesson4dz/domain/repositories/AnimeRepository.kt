package com.example.android5lesson4dz.domain.repositories

import com.example.android5lesson4dz.domain.models.DataItem
import com.example.android5lesson4dz.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {

    suspend fun fetchAnime(): Flow<Resource<List<DataItem>>>
}