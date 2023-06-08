package com.example.android5lesson4dz.domain.usecases

import com.example.android5lesson4dz.domain.repositories.MangaRepository
import javax.inject.Inject

class FetchMangaUseCase @Inject constructor(
    private val mangaRepository: MangaRepository
) {

    operator fun invoke() = mangaRepository.fetchManga()
}