package com.example.android5lesson4dz.presentation.ui.fragments.manga

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android5lesson4dz.R
import com.example.android5lesson4dz.databinding.FragmentMangaBinding
import com.example.android5lesson4dz.domain.utils.Resource
import com.example.android5lesson4dz.presentation.base.BaseFragment
import com.example.android5lesson4dz.presentation.models.DataItemUI
import com.example.android5lesson4dz.presentation.models.toUI
import com.example.android5lesson4dz.presentation.ui.adapter.MangaAdapter
import com.example.android5lesson4dz.presentation.ui.fragments.home.HomeFragmentDirections
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MangaFragment : BaseFragment<FragmentMangaBinding, MangaViewModel>(R.layout.fragment_manga) {

    override val binding by viewBinding(FragmentMangaBinding::bind)
    override val viewModel: MangaViewModel by viewModels()
    private val mangaAdapter = MangaAdapter(this::onItemClick)

    override fun initialize() {
        binding.mangaRecView.adapter = mangaAdapter
    }

    override fun setupSubscribes() {
        subscribeToFetchManga()
    }

    private fun subscribeToFetchManga() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.fetchManga().collect {
                    when (it) {
                        is Resource.Error -> {
                            Toast.makeText(requireContext(), "error", Toast.LENGTH_SHORT).show()
                        }
                        is Resource.Loading -> {}
                        is Resource.Success -> {
                            mangaAdapter.submitList(it.data?.map {
                                it.toUI()
                            })
                        }
                    }
                }
            }
        }
    }

    private fun onItemClick(model: DataItemUI) {
        findNavController().navigate(
            HomeFragmentDirections.actionHomeFragmentToMangaDetailFragment(model)
        )
    }
}
