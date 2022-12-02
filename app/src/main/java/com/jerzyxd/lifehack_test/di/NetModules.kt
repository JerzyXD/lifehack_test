package com.jerzyxd.lifehack_test.di

import com.jerzyxd.lifehack_test.data.net.RetrofitFactory
import com.jerzyxd.lifehack_test.data.net.RetrofitRepository
import com.jerzyxd.lifehack_test.domain.net.CompanyNetRepository
import okhttp3.Interceptor
import org.koin.core.module.Module

fun Module.provideNetModules(baseUrl: String) {

    provideRetrofit(baseUrl)

    single<CompanyNetRepository> {
        RetrofitRepository(get())
    }
}


private fun Module.provideRetrofit(
    baseBackendUrl: String,
) {
    single {
        createRetrofit(
            baseBackendUrl,
        )
    }
}

private fun createRetrofit(
    baseBackendUrl: String,
    vararg interceptors: Interceptor,
) = RetrofitFactory().create(
    baseBackendUrl,
    *interceptors,
)
