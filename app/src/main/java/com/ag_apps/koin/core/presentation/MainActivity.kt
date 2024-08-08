package com.ag_apps.koin.core.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ag_apps.koin.core.presentation.ui.theme.KoinTheme
import com.ag_apps.koin.feature.presentation.FeatureScreen
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoinTheme {
                val mainViewModel: MainViewModel = koinViewModel()
                FeatureScreen()
            }
        }
    }
}
















