package com.ag_apps.koin.feature.di

import com.ag_apps.koin.feature.data.RepositoryImpl
import com.ag_apps.koin.feature.data.api.SomeApi
import com.ag_apps.koin.feature.domain.Repository
import com.ag_apps.koin.feature.presentation.FeatureViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author Ahmed Guedmioui
 */

val featureModule = module {
    single {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(SomeApi.BASE_URL)
            .build()
            .create(SomeApi::class.java)
    }

    single<Repository>(qualifier = named("RepositoryImpl")) {
        RepositoryImpl(get())
    }
//    singleOf(::RepositoryImpl).bind<Repository>()

    viewModel {
        FeatureViewModel(get(named("RepositoryImpl")))
    }
}





















