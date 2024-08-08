package com.ag_apps.koin

import android.app.Application
import com.ag_apps.koin.core.di.coreModule
import com.ag_apps.koin.feature.di.featureModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author Ahmed Guedmioui
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                coreModule,
                featureModule
            )
        }
    }
}

















