package com.example.android5lesson4dz.domain.usecases

import com.example.android5lesson4dz.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {

    operator fun invoke() = animeRepository.fetchAnime()
}