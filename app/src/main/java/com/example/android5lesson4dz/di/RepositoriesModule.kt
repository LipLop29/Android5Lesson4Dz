package com.example.android5lesson4dz.di

import com.example.android5lesson4dz.data.repositories.AnimeRepositoryImpl
import com.example.android5lesson4dz.data.repositories.MangaRepositoryImpl
import com.example.android5lesson4dz.domain.repositories.AnimeRepository
import com.example.android5lesson4dz.domain.repositories.MangaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun provideMangaRepository(repositoryImpl: MangaRepositoryImpl): MangaRepository

    @Binds
    fun provideAnimeRepository(repositoryImpl: AnimeRepositoryImpl): AnimeRepository
}