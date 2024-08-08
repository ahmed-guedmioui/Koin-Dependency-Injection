package com.ag_apps.koin.feature.presentation

import androidx.lifecycle.ViewModel
import com.ag_apps.koin.feature.domain.Repository

/**
 * @author Ahmed Guedmioui
 */
class FeatureViewModel(
    private val repository: Repository
) : ViewModel() {

    suspend fun getData(): String {
        return repository.getData()
    }
}

















