package com.example.android5lesson4dz.presentation.ui.fragments.manga

import androidx.lifecycle.ViewModel
import com.example.android5lesson4dz.domain.usecases.FetchMangaUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val fetchMangaUseCase: FetchMangaUseCase
) : ViewModel() {

    fun fetchManga() = fetchMangaUseCase.invoke()
}