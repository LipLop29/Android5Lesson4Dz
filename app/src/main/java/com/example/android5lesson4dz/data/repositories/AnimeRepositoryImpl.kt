package com.example.android5lesson4dz.data.repositories

import com.example.android5lesson4dz.data.remote.apiservices.AnimeApiService
import com.example.android5lesson4dz.data.remote.dtos.toDomain
import com.example.android5lesson4dz.data.base.BaseRepository
import com.example.android5lesson4dz.domain.repositories.AnimeRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    override fun fetchAnime() = doRequest {
        animeApiService.fetchAnime().data.map {
            it.toDomain()
        }
    }
}