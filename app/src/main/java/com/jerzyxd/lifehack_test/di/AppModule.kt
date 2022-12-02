package com.jerzyxd.lifehack_test.di

import com.jerzyxd.lifehack_test.BuildConfig.BASE_URL
import com.jerzyxd.lifehack_test.domain.di.provideDomainModules
import org.koin.dsl.module

fun appModule() = module {
//    provideDataFlow()
//    provideControllers()
//    provideConfigModules()
    provideDomainModules()
    provideNetModules(BASE_URL)
}