package com.jerzyxd.lifehack_test.domain.di

import com.jerzyxd.lifehack_test.domain.usecases.CompaniesUseCase
import org.koin.core.module.Module

fun Module.provideDomainModules() {

    single { CompaniesUseCase(get()) }

}