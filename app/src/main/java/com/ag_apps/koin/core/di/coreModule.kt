package com.ag_apps.koin.core.di

import android.content.Context
import com.ag_apps.koin.core.presentation.MainViewModel
import com.ag_apps.koin.feature.data.RepositoryImpl
import com.ag_apps.koin.feature.data.RepositoryImpl2
import com.ag_apps.koin.feature.domain.Repository
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * @author Ahmed Guedmioui
 */

val coreModule = module {
    single {
        androidContext().getSharedPreferences(
            "shared_prefs", Context.MODE_PRIVATE
        )
    }

    single<Repository>(qualifier = named("RepositoryImpl2")) {
        RepositoryImpl2(get())
    }

    viewModel {
        MainViewModel(get(named("RepositoryImpl2")))
    }
}












