package com.ag_apps.koin.core.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ag_apps.koin.feature.domain.Repository
import kotlinx.coroutines.launch

/**
 * @author Ahmed Guedmioui
 */
class MainViewModel(
    private val repository: Repository
) : ViewModel() {

    init {
        viewModelScope.launch {
            println("we got mainViewModel: ${repository.getData()}")
        }
    }
}

















