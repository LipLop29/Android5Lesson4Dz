package com.example.android5lesson4dz.data.repositories

import com.example.android5lesson4dz.data.remote.apiservices.MangaApiService
import com.example.android5lesson4dz.data.remote.dtos.toDomain
import com.example.android5lesson4dz.data.base.BaseRepository
import com.example.android5lesson4dz.domain.repositories.MangaRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {

    override suspend fun fetchManga() = doRequest {
        mangaApiService.fetchManga().data.map {
            it.toDomain()
        }
    }
}