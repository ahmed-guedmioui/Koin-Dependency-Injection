package com.ag_apps.koin.feature.data

import com.ag_apps.koin.feature.data.api.SomeApi
import com.ag_apps.koin.feature.domain.Repository

/**
 * @author Ahmed Guedmioui
 */
class RepositoryImpl(
    private val someApi: SomeApi
) : Repository {
    override suspend fun getData(): String {
        someApi
        return "data"
    }
}