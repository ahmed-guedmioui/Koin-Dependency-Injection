package com.ag_apps.koin.feature.domain

/**
 * @author Ahmed Guedmioui
 */
interface Repository {
    suspend fun getData(): String
}