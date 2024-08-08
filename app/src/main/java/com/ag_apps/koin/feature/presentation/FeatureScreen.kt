package com.ag_apps.koin.feature.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import org.koin.androidx.compose.koinViewModel

/**
 * @author Ahmed Guedmioui
 */

@Composable
fun FeatureScreen(
    featureViewModel: FeatureViewModel = koinViewModel()
) {
    LaunchedEffect(Unit) {
        println("we got: ${featureViewModel.getData()}")
    }
}